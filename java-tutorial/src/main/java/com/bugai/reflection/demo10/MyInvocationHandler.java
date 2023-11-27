package com.bugai.reflection.demo10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

  private MyInterface myInterface;

  public MyInvocationHandler(MyInterface myInterface) {
    this.myInterface = myInterface;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("Say Hello before");
    method.invoke(myInterface, args);
    System.out.println("Say Hello after");
    return null;
  }

  public static void main(String[] args) {

    MyInterfaceObject object = new MyInterfaceObject();
    MyInvocationHandler handler = new MyInvocationHandler(object);
    MyInterface proxyInstance = (MyInterface) Proxy.newProxyInstance(MyInterface.class.getClassLoader(),
            new Class[]{MyInterface.class}, handler);

    proxyInstance.sayHello("zhangsan");

    //    proxyInstance.sayHello("zhangsan");
  }
}
