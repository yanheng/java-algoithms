package com.bugai.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.ExecutableType;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

@SupportedAnnotationTypes("com.bugai.annotation.BuildProperty")
public class MyBuilderProcess extends AbstractProcessor {
  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    for (TypeElement annotation : annotations) {
      Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
      Map<Boolean, ? extends List<? extends Element>> annotatedMethods = annotatedElements.stream().collect(
              Collectors.partitioningBy(element -> ((ExecutableType) element.asType()).getParameterTypes().size() == 1
                      && element.getSimpleName().toString().startsWith("set"))
      );

      List<? extends Element> setters = annotatedMethods.get(true);
      List<? extends Element> otherMethods = annotatedMethods.get(false);
      otherMethods.forEach(element -> processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
              "@BuilderProperty 注解必须放到方法上并且是set开头的单参数方法", element));

      if (setters.isEmpty()) {
        continue;
      }

      Map<String, List<Element>> groupMap = new HashMap<>();

      setters.forEach(setter -> {
        String className = ((TypeElement) setter.getEnclosingElement()).getQualifiedName().toString();

        List<Element> elements = groupMap.get(className);
        if (elements != null) {
          elements.add(setter);
        } else {
          List<Element> newElements = new ArrayList<>();
          newElements.add(setter);
          groupMap.put(className, newElements);
        }
      });

      groupMap.forEach((groupSetterKey, groupSetterValue) -> {
        Map<String, String> setterMap = groupSetterValue.stream().collect(Collectors.toMap(
                setter -> setter.getSimpleName().toString(),
                setter -> ((ExecutableType) setter.asType()).getParameterTypes().get(0).toString()
        ));
        try {
          writeBuilderFile(groupSetterKey, setterMap);
        } catch (Exception e) {
          e.printStackTrace();
          throw new RuntimeException();
        }
      });
    }
    return true;
  }

  private void writeBuilderFile(
          String className, Map<String, String> setterMap)
          throws IOException {

    String packageName = null;
    int lastDot = className.lastIndexOf('.');
    if (lastDot > 0) {
      packageName = className.substring(0, lastDot);
    }

    String simpleClassName = className.substring(lastDot + 1);
    String builderClassName = className + "Builder";
    String builderSimpleClassName = builderClassName
            .substring(lastDot + 1);

    JavaFileObject builderFile = processingEnv.getFiler()
            .createSourceFile(builderClassName);

    try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {

      if (packageName != null) {
        out.print("package ");
        out.print(packageName);
        out.println(";");
        out.println();
      }

      out.print("public class ");
      out.print(builderSimpleClassName);
      out.println(" {");
      out.println();

      out.print("    private ");
      out.print(simpleClassName);
      out.print(" object = new ");
      out.print(simpleClassName);
      out.println("();");
      out.println();

      out.print("    public ");
      out.print(simpleClassName);
      out.println(" build() {");
      out.println("        return object;");
      out.println("    }");
      out.println();

      setterMap.entrySet().forEach(setter -> {
        String methodName = setter.getKey();
        String argumentType = setter.getValue();

        out.print("    public ");
        out.print(builderSimpleClassName);
        out.print(" ");
        out.print(methodName);

        out.print("(");

        out.print(argumentType);
        out.println(" value) {");
        out.print("        object.");
        out.print(methodName);
        out.println("(value);");
        out.println("        return this;");
        out.println("    }");
        out.println();
      });

      out.println("}");
    }
  }

  @Override
  public synchronized void init(ProcessingEnvironment processingEnv) {
    super.init(processingEnv);
    System.out.println("----------");

    System.out.println(processingEnv.getOptions());

  }

  @Override
  public SourceVersion getSupportedSourceVersion() {
    return SourceVersion.latestSupported();
  }
}
