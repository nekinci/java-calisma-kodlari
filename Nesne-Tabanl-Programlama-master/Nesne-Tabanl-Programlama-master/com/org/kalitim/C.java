package com.org.kalitim;

class D{
	public D(int a){
		System.out.println("Tek parametreli yapıcı: "+a);
	}
	public D(int a,int b){
		System.out.println("İki parametreli yapıcı: "+a+" ve "+b);
	}
}
public class C extends D {
	
	public C(){
		super(4); //super metodu hangi yapıcının çağrılacağına karar veriyor.
		System.out.println("C nin yapıcısı");
		//eğer super-class'taki yapıcı parametre alıyorsa super(); metodunun çağrılması zorunludur.
	}

	public static void main(String[] args) {
		
		C n=new C();
	}

}
