package com.org.polimorfizm;

class UstSinif{
	public void yaz(){
		System.out.println("Burası Üst Sınıf");
	}
}
class AltSinif1 extends UstSinif{
	public void yaz(){
		System.out.println("Burası Alt Sınıf1");
	}
}
class AltSinif2 extends UstSinif{
	public void yaz(){
		System.out.println("Burası Alt Sınıf2");
	}
}


public class ParametreBildirme {

	public static void nesneAl(UstSinif a){ //parametre tipi üstsınıf
		a.yaz();
	}
	public static void main(String[] args) {
		UstSinif a1=new UstSinif();
		AltSinif1 a2=new AltSinif1();
		AltSinif2 a3=new AltSinif2();
		nesneAl(a1);
		nesneAl(a2);
		nesneAl(a3);

	}

}
