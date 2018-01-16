package com.github.design.singleton;

/**
 * 
 * @author mxsm
 * 2018-01-16 20:25:11
 * Description:
 */

public class Singleton {

	private static Singleton singleton = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
