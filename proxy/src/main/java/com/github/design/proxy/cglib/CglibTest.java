package com.github.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

/**
 * 
 * @author mxsm
 * 2018-01-17 21:13:09
 * Description:
 */

public class CglibTest {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(SampleClass.class);
		enhancer.setCallback(new FixedValue() {
			@Override
			public Object loadObject() throws Exception {
				// TODO Auto-generated method stub
				return "Hello cglib!";
			}
		});
		SampleClass proxy = (SampleClass) enhancer.create();
		System.out.println(proxy);
		System.out.println(proxy.test("aaaa"));
	}
	
}
