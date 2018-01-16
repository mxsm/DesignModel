package com.github.design.singleton;

/**
 * 
 * @author mxsm
 * 2018-01-16 20:23:49
 * Description:
 */

public class Singleton2 {

	private static Singleton2 singleton1 = new Singleton2();
	
	private Singleton2() {
		
	}
	
	public static synchronized Singleton2 getInstance() {
		return singleton1;
	} 
	
}
