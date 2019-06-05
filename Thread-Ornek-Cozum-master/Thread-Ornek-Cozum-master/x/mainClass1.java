package com.org.x;

class ornek1 extends Thread{
	private int sayi;
	private String ad;
	public ornek1(String ad,int sayi){
		this.ad=ad;
		this.sayi=sayi;
		start();
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Ad ve Numara: "+ad+" "+sayi);
		}
	}
}
public class mainClass1 {

	private static ornek1 oo;

	public static void main(String[] args) {
		oo = new ornek1("MUSTAFA",3);
		
	}

}
