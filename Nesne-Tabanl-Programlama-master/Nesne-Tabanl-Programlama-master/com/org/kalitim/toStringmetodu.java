package com.org.kalitim;

class calisan{
	int yas;
	String ad;
	String soyad;
	public calisan(String ad,String soyad,int yas){
		this.ad=ad;this.soyad=soyad;this.yas=yas;
	}
	@Override
	public String toString(){
		return "Ad: "+ad+" Soyad: "+"Yas: "+yas;
	}
}
public class toStringmetodu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calisan n1=new calisan("Niyazi","Ekinci",18);
		System.out.println(n1.toString());

	}

}
