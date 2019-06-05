package com.org.kalitim;

import java.util.Scanner;

class finalleme2{
	final void metod1(){
		System.out.println("Bu metod override edilemez.");
	}
}

public class finalleme extends finalleme2 {

	/**
	 * @param args
	 */
//	final  void metod1(){
//		System.out.println("Bu metod override edilmeye çalıştı");
//	}
//	son olarak ise metod parametresi olan final değişkenide metod içinde değiştirilemez.
	private final int x;  //final metodu bir daha değiştirilmemesi içindir.
	public finalleme(int x){ //metodlarda alt satırda tanımlayabiliriz ama diğer yerlerde bulunduğu satırda tanımlanır.
		this.x=x; //yapıcı metotlar kullanılarak sonradan finale değer atanabilir.
	}
	static int al(){
		final int y;
		y=5;
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		finalleme d=new finalleme(x);
		System.out.println(d.x);
		System.out.println(al());
		d.metod1();
	}

}
