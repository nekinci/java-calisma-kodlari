package com.org.kalitim;

class A{
	public A(){
		System.out.println("A nın yapıcısı");
	}
}
public class B extends A {
	public B(){
		//super();
		System.out.println("B sınıfnın yapıcısı");
	}
	public static void main(String[] args) {
		B n1=new B();
		
	}

}
