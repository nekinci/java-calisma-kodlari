package com.org.kapsulleme.dort;

public class statikAnahtarKelimesi {

	private String ad;
	private String soyad;
	private String bolum;
	static int sayi=0;
	public statikAnahtarKelimesi(String ad,String soyad,String bolum)
	{
		this.ad=ad;
		this.soyad=soyad;
		this.bolum=bolum;
		sayi++;
		System.out.println(ad+" "+soyad+" "+bolum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sayi);
		statikAnahtarKelimesi kisi1=new statikAnahtarKelimesi("Niyazi", "soyad", "bolum");
		statikAnahtarKelimesi kisi2=new statikAnahtarKelimesi("Niyazi", "soyad", "bolum");
		statikAnahtarKelimesi kisi3=new statikAnahtarKelimesi("Niyazi", "soyad", "bolum");
		System.out.println(statikAnahtarKelimesi.sayi);
		System.out.println(sayi);
		System.out.println(kisi1.sayi);
	}

}
