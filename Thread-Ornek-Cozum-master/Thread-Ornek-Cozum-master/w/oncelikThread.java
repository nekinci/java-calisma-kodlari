package com.org.w;

public class oncelikThread {

	public static void main(String[] args) {
			thread1 t1=new thread1();
			thread2 t2=new thread2();
			t1.setPriority(Thread.MIN_PRIORITY);
			t1.start();
			t2.setPriority(Thread.MAX_PRIORITY);
			t2.start();
	}

}

class thread1 extends Thread{
	public void run(){
		while(true)
			System.out.println("Ahmet ");
	}
}
class thread2 extends Thread{
	public void run(){
		while(true)
			System.out.println("Mehmet ");
	}
}