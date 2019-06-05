package com.org.x;

class ornek extends Thread{
	public ornek(){
		
	}
	public void run(){
		System.out.println("Ornek adlı kanal çalışıyor");
	}
}
public
class mainClass {
	public static void main(String[] args) {
		ornek o1=new ornek();
		o1.start();
	}

}
