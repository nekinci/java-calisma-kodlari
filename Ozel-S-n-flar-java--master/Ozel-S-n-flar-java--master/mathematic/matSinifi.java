package com.org.mathematic;

import java.util.Random;

public class matSinifi {

	public static void main(String[] args) {
		int a=(int) Math.pow(3, 5); // üs alma işlemi //cast ettik çünkü double türünde döndürür.
		System.out.println(a);
		System.out.println(Math.pow(5, 5));
		int b=(int) Math.sqrt(16); //karekökünü alır.
		System.out.println(b);
		int c=Math.abs(-1*100); //mutlak değerini verir. cast'e gerek yoktur
		System.out.println(c);
		double d=Math.floor(6.4);//alt değere yuvarlar.
		int e=(int)Math.floor(6.6);
		System.out.println(d+" "+e);
		double f=Math.ceil(6.1); // üst değere yuvarlar.(istisna=7.0 sıfır yazarsak 7 de kalır yuvarlamaz)
		System.out.println(f);
		System.out.println(Math.max(7, 9)); // büyük sayıyı ekrana basar
		System.out.println(Math.max(4, 4.00000000001));
		System.out.println(Math.min(3, 5));//küçük olanı ekrana basar.
		System.out.println(Math.random()); // 0 ile 1 arasında rasgele bir değer üretir.
		int g=(int)(Math.random()*10); //0 ile 10 arasında rasgele bir değer üretir.
		System.out.println(g);
		int [] dizi=new int[6];
		
		Random r=new Random(); //buda sınıf olan random
//		for(int i=0;i<dizi.length;i++){
//			dizi[i]=r.nextInt(100);
//			System.out.println("Dizinin "+(i+1)+".elemanı : "+dizi[i]);
//		}
		System.out.println(r.nextBoolean()); //boolean tipinde random üretir.
		System.out.println(r.nextInt(50));  // 0 ile 49 dahil 50 ye kadar random üretir
		System.out.println(r.nextDouble()); //double türünde
		System.out.println(r.nextFloat());	//float türünde
		System.out.println(r.nextGaussian()); // gaus sayısı randomları ürettik.
		
		System.out.println("3 Radyan: "+Math.toDegrees(3)+" Derece"); //radyanı dereceye çevirir
		System.out.println("180 Derece: "+Math.toRadians(180)+" Radyan"); //Dereceyi radyana çevirir
		System.out.println(Math.sin(Math.toRadians(90))); //sinüs hesaplar radyan tipinde parametre alır
		System.out.println(Math.toDegrees(Math.asin(1))); //ters(arc) sinüs hesaplar ilk sinüs değerini hesaplar sonra dereceye çevrilir
		System.out.println(Math.cos(Math.toRadians(0))); //cosinüs hesaplar
		System.out.println(Math.toDegrees(Math.asin(0)));//arccosinüs hesabı
		System.out.println(Math.PI); //ve mükemmel sayı PI sayısı
		
		/*
		 * Logaritma Metodları (3 tane)
		 * @author nekinci
		 * log(double deger); // e tabanında logaritma
		 * log10(double deger); //10 tabanında logaritma
		 * log1p(double deger); // degerin 1 fazlasının doğal logaritması
		 * */
		System.out.println(Math.log(Math.E*Math.E)); // e^2 sayısının e tabanında logaritması
		System.out.println(Math.log10(100)); //log10 tabanında 100=2;
		System.out.println(Math.log1p(Math.E-1));//log1p tabanında logaritması
		
	}

}
