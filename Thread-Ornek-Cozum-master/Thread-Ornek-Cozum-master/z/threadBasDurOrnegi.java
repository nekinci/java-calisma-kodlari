package com.org.z;

import java.util.Scanner;

public class threadBasDurOrnegi {
	private static final long SN=1000;
	public static void main(String[] args) throws Exception {
			Thread t1=new threadOrnek("1.thread");
			Thread t2=new threadOrnek("2.thread");
			//t2.sleep(SN);
			t2.wait();
			int i=(new Scanner(System.in).nextInt());
			if(i==1){
				t2.notify();				
			}
			Thread t3=new threadOrnek("3.thread");
			Thread t4=new threadOrnek("4.thread");
	}	

}
class threadOrnek extends Thread{
	public threadOrnek() {
		// TODO Auto-generated constructor stub
	}
	public threadOrnek(String isim){
		super(isim);
		start();
	}
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
