package com.org.tryCatch;

public class newThrowsKullanimi {

	public void  metod1() throws Exception{
		int x=0,y=4;
		System.out.println(y/x);
	}
	public void metod2(){
		try{
			metod1();
			}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		newThrowsKullanimi nesne=new newThrowsKullanimi();
		nesne.metod2();

	}

}
