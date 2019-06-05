package com.org.kalitim;

class F{
	int x;
	String ad;
	public F(int x,String ad){
		this.x=x;
		this.ad=ad;
	}
	public F(String ad,int x){
		this.ad=ad;
		this.x=x;
	}
	void yazdir(){
		System.out.println("Adınız: "+ad+" Numaranız: "+x);
	}
}
public class E extends F {

	public E(){
		//super("Niyazi",678);
		super(678,"Niyazi"); // iki yapıcının parametre sıraları farklı olduğu için super metodu içinde 
		//farklı tanımlayabiliyoruz.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E n1=new E();
		n1.yazdir();
	}

}
