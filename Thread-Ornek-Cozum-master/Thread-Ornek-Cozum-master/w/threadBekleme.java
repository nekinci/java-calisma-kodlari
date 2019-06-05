package com.org.w;


public class threadBekleme {
	
public static void main(String[] args) throws Exception{
		
		for(int i=0;i<3;i++){
			Thread kanal2=new threadOrnek(i+1,"thread2");
			Thread kanal1=new threadOrnek(i+1,"thread1");
			kanal1.yield();
		}
	}
}
class threadOrnek extends Thread{
	int sayi=0;
	String isim;
	public threadOrnek(int sayi,String isim) throws Exception {
		super(isim);
		this.sayi=sayi;
		this.isim=isim;
		start();
		sleep(100);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"["+sayi+"]");
	}
}