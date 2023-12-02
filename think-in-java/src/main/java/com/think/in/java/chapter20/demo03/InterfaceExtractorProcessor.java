package com.think.in.java.chapter20.demo03;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.util.ElementFilter;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;


@SupportedAnnotationTypes("com.think.in.java.chapter20.demo03.ExtractInterface")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class InterfaceExtractorProcessor extends AbstractProcessor {

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    Set<? extends Element> elementsAnnotatedWith = roundEnv.getElementsAnnotatedWith(ExtractInterface.class);
    if (elementsAnnotatedWith == null) {
      return false;
    }
    for (Element element : elementsAnnotatedWith) {
      if (element.getKind() == ElementKind.CLASS) {
        TypeElement typeElement = (TypeElement) element;
        String interfaceName = typeElement.getSimpleName() + "Interface";
        try {
          JavaFileObject fileObject = processingEnv.getFiler().createSourceFile(interfaceName);
          try (PrintWriter writer = new PrintWriter(fileObject.openWriter())) {
            writer.println("public interface " + interfaceName + " {");
            List<ExecutableElement> methods = ElementFilter.methodsIn(typeElement.getEnclosedElements());
            for (ExecutableElement method : methods) {
              if (method.getModifiers().contains(Modifier.PUBLIC)) {
                writer.print("    ");
                writer.print(method.getReturnType() + " " + method.getSimpleName() + "(");
                // 处理方法参数
                boolean firstParam = true;
                for (VariableElement parameter : method.getParameters()) {
                  if (!firstParam) {
                    writer.print(",");
                  }
                  writer.print(parameter.asType() + " " + parameter.getSimpleName());
                  firstParam = false;
                }
                writer.println(");");
              }

            }
            writer.println("}");
          } catch (IOException e) {
            e.printStackTrace();
          }
        } catch (IOException e) {
          e.printStackTrace();
        }

      }
    }
    //    for (TypeElement annotation : annotations) {
    //      Set<? extends Element> elementsAnnotated = roundEnv.getElementsAnnotatedWith(annotation);
    //      if (!elementsAnnotated.isEmpty()) {
    //        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,
    //                "Found elements with @" + annotation.getSimpleName());
    //      }
    //    }
    return true;
  }

}
