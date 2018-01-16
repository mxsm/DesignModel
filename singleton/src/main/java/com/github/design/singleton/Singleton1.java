package com.github.design.singleton;

/**
 * 
 * @author mxsm
 * 2018-01-16 20:23:49
 * Description:
 */

public class Singleton1 {

	private static Singleton1 singleton1 = null;
	
	private Singleton1() {
		
	}
	
	public static synchronized Singleton1 getInstance() {
		
		if(singleton1 == null) {
			singleton1 = new Singleton1();
		}
		return singleton1;
	} 
	
}
