package com.org.kalitim;

class Hayvan{
	public void nefesAl(){
		System.out.println("Nefes alınıyor..");
	}
}
public class Surungen extends Hayvan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surungen yilan=new Surungen();
		yilan.nefesAl();
	}

}
//sürüngen sınıfı hayvan sınıfından türetilmiştir. sürüngen sınıfında hayvan sınıfında olan özellikler vardır.
//fakat hayvan sınıfında sürüngen sınıfında olan özellikler veya durumlar yoktur.