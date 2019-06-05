package com.org.enums;

enum Arabalar{
	Audi("Beyaz"),BMW(190),Toros(90),Kartal(110);
	public int hiz;
	public String renk;
	Arabalar(int hiz){
		this.hiz=hiz;
	}
	Arabalar(String renk){
		this.renk=renk;
	}
}
public class ennumlar {

	/**
	 * @param args
	 * @author nekinci
	 * @since 2016
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arabalar.Audi.hiz=100;
		System.out.println(Arabalar.Audi.hiz);
		System.out.println(Arabalar.Toros.hiz);
		System.out.println(Arabalar.Audi.renk);
		System.out.println(Arabalar.Audi.ordinal()); //ordinal metoduyla enum'un indisi
		for(Arabalar a:Arabalar.values()){
			System.out.print(a.name()+"--");
			System.out.println(a.hiz);
		}
	}

}
