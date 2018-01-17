package com.github.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 
 * @author mxsm
 * 2018-01-17 20:59:24
 * Description:
 */

public class MainTest {

	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		InvocationHandler handler = new InvocationHandlerImpl(realSubject);
		ClassLoader loader = realSubject.getClass().getClassLoader();
		Class<?>[] interfaces = realSubject.getClass().getInterfaces();
		Subject subject = (Subject) Proxy.newProxyInstance(loader, interfaces, handler);
		System.out.println("动态代理对象的类型："+subject.getClass().getName());
		String hello = subject.sayHello("jiankunking");
		System.out.println(hello);
	}
	
}
