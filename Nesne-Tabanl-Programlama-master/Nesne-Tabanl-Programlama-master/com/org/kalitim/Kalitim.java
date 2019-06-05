package com.org.kalitim;

class Sinif1{
	int x;
	void metod1(){
		System.out.println("Burası metod1");
	}
}
class Sinif2 extends Sinif1{
	int y;
	void metod2()
	{
		System.out.println("Burası metod2");
	}
}
public class Kalitim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Sinif2 s2=new Sinif2();
		s2.x=5;
		System.out.println(s2.x);
		s2.metod1();
		s2.y=3;
		System.out.println(s2.y);
		Sinif1 s1=new Sinif1();
		//s1.y=3;//bu kullanım hatalıdır çünkü sinif1den sinif2 ye kalıtım yapılmıştır ve sinif1 sinif2 nin özelliklerini
		//s1.metod2();		//taşımaz.
	}

}
