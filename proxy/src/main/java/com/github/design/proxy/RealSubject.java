package com.github.design.proxy;

/**
 * 
 * @author mxsm
 * 2018-01-17 20:52:46
 * Description:
 */

public class RealSubject implements Subject {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "hello " + name;
	}

	@Override
	public String sayGoodbye() {
		// TODO Auto-generated method stub
		return " good bye ";
	}

}
