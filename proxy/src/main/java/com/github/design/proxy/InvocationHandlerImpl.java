package com.github.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author mxsm 2018-01-17 20:55:09 Description:
 */

public class InvocationHandlerImpl implements InvocationHandler {

	private Object subject;

	public InvocationHandlerImpl(Object subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("在调用之前，我要干点啥呢？");

		System.out.println("Method:" + method);

		Object returnValue = method.invoke(subject, args);

		System.out.println("在调用之后，我要干点啥呢？");
		return returnValue;
	}

}
