package com.org.donguler;

public class ShadowTest {

	/**
	 * @param args
	 */
	
	public int x=0;
	
	class FirstLevelInnerClass{
		public int x=1;
		public void MetodInner(int x){
			System.out.println("x: "+x);
			System.out.println("this.x (for FirstLevelInnerClass) :"+this.x);
			System.out.println("ShadowTest.this.x (for ShadowTest Class: )"+ShadowTest.this.x);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
