package com.org.donguler;


public class ShadowingTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShadowTest f1=new ShadowTest();
		ShadowTest.FirstLevelInnerClass f2=f1.new FirstLevelInnerClass();
		f2.MetodInner(5);
		
	}

}
