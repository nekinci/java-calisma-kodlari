package com.org.arayuz;

interface kitap{
	
	public void set(String tur,String yazar,int fiyat);
	public void yazdir();
}

class Bilimkurgu implements kitap{

	String tur;
	String yazar;
	int fiyat ;

	public void set(String tur,String yazar,int fiyat){
		this.tur=tur;
		this.yazar=yazar;
		this.fiyat=fiyat;
	}
	public void yazdir(){
		System.out.println(tur+" "+yazar+" "+fiyat);
	}
}
public class Kitap {
	
	public static void main(String args[]){
		Bilimkurgu k1=new Bilimkurgu();
		k1.set("Bilimkurgu", "Robin hood", 15);
		k1.yazdir();
	}
}
