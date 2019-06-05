package com.org.kapsulleme.uc;

public class ThisKey {
	
	public ThisKey(String ad){
		this(ad,"Ekinci");
	}
	public ThisKey(String ad,String soyad){
		System.out.println(ad+" "+soyad);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey n=new ThisKey("Niyazi");
	}

}
