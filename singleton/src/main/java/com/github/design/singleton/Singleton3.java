package com.github.design.singleton;

/**
 * 
 * @author mxsm
 * 2018-01-16 20:23:49
 * Description:
 */

public class Singleton3 {

	private static volatile Singleton3 singleton1 = null;
	
	private Singleton3() {
		
	}
	
	public static synchronized Singleton3 getInstance() {
		
		if(singleton1 == null) {
			synchronized (Singleton3.class) {
				if(singleton1 == null) {
					singleton1 = new Singleton3();
				}
			}
		}
		return singleton1;
	} 
	
}
