package com.org.Strings;

import java.util.StringTokenizer;

public class Stringler {
	public static void main(String[] args){
		String s1="JAVA öğrenmeyi çok seviyorum.";
		int c=s1.length();
		System.out.println("Katar uzunluğu "+c);
		String s2=" Niyazi Ekinci";
		String s3="";
		s3=s1.concat(s2); //stringleri birleştirmek için kullanılır.
		System.out.println(s3);
		String k1="JAVA",k2="C#",k3="java",k4="JAVA",k5="sezer",k6="sezen";
		if(k1==k4)
			System.out.println("Eşitler"); //her zaman doğru sonucu vermez.
		if(k1.equals(k4)) //equals metodu kullanımı, iki stringi karşılaştırır.Büyük-küçük harf duyarlı
			System.out.println("Eşitler1"); 
		if(k1.equalsIgnoreCase(k3))
			System.out.println("Eşitler2"); //büyük küçük harf duyarsız.
		if(k5.compareTo(k6)<0) //k1 le k2 yi karşılaştırdık.
			System.out.println("sezer Büyük"); //k1 büyükse 0dan küçük değer döner
		else							//k2 büyükse 0 dan büyük değer döner
			System.out.println("sezen büyük");//0 dönerse eşittir(büyük-küçük duyarlı) compareToIgnoreCase(duyarsız)
		//sezer ismi sezen isminden küçüktür
		/*
		 * regionMatches metodu büyük önem taşımakta.
		 * Referans(ilk verilen metod dersek anlarız) Stringin içinde ikinci stringi arar.
		 * Kullanımı -> katar.regionMatches(kaçıncı karakterden sonra,aranacak string,aranacak stringin başı,aranacak stringin kaç karakteri)
		 * Metodun ilk parametresi -> hangi indis değerinden başlanacağı
		 * Metodun ikinci parametresi -> hangi string ile karşılaştırılacak.
		 * Metodun üçüncü parametresi -> aranacak stringin başlangıç indisi
		 * Metodun dördüncü parametresi -> aranacak stringin başlangıç indisinden sonra kaç karakteri 
		 * k5 katarında 0ncı indisten itibaren k6 katarının 0 dan başlayarak 4 karakterini ara
		 * */
		boolean isFound=false;
		isFound=k5.regionMatches(0, k6, 0, 4); //sezer isminde seze kelimesini aradık.
		if(isFound==true)
			System.out.println("Bulundu!");
		//startsWith() metodu referans olarak verilen metodla başlayıp başlamadığını kontrol eder
		//endsWith() metodu referans olarak verilen metodla bitip bitmediğini kontrol eder.
		boolean check;
		String s7="Java dili";
		check=s7.startsWith("Java");
		System.out.println(check);
		check=s7.startsWith("JAVA");
		System.out.println(check); //büyük küçük harfe duyarlı.
		check=s7.endsWith("ili");
		System.out.println(check);
		check=s7.startsWith("ava", 1); //hangi indisten başlanacağını belirtir.
		System.out.println(check);
		
		//getChars kullanımı
		// getChars(int baslangıç,int bitiş,char kaynakDizi[],int kaynakİndis)
		char sourceArray[]=new char [6];
		char sourceArray1[]=new char [9];
		String dizge="Bu bölümde String nesnesinin metotlarını öğreniyoruz";
		dizge.getChars(11, 17, sourceArray, 0); //11den başla 17 ye kadar sourceArray dizisinin 0ncı indisinden itibaren
		dizge.getChars(18, 27, sourceArray1, 0);
		System.out.println(sourceArray);
		System.out.println(sourceArray1);
		
		String alfabe="ABCÇDEFGHIİJKLMNOÖPRSŞTUÜVYZ";
		System.out.println("Alfabenin 10.harfi -> "+alfabe.charAt(9));
		System.out.println("Alfabenin 21.harfi -> "+alfabe.charAt(20));
		int length=alfabe.length();
		char[] alfabeAry=new char[length];
		alfabeAry=alfabe.toCharArray(); // diziye stringi atar karakter karakter.
		for(int i=0;i<length;i++){
			System.out.print(alfabeAry[i]);		
		}
		
		/*İndex Of ve Last İndex Of metodları string içinde aranılan karakterin ilk ve son indislerini verir.*/
		System.out.println("a karakteri için ilk indis "+dizge.indexOf("a"));
		System.out.println("a karakteri için son indis"+dizge.lastIndexOf("a"));
		System.out.println("bölüm dizgesi için ilk indis"+dizge.indexOf("bölüm"));
		System.out.println("bölüm dizgesi için son indis"+dizge.lastIndexOf("bölüm"));
		System.out.println("a karakteri için 35nci indisten sonraki ilk indis"+dizge.indexOf("a", 36)); //gördüğümüz
																										//gibi bulamadı
		/*
		 * String Düzenleme Metotları
		 * */
		String katar7="          Bu örnek substring metodu kullanımı için yapılmış";
		String subKatar="";
		String subKatar1="";
		subKatar=katar7.substring(7, 15); //7, 15 indisler arasını yazar.
		subKatar1=katar7.substring(16,32);//16, 32 indisler arasını yazar.
		System.out.println(subKatar);
		System.out.println(subKatar1);
		
		katar7=katar7.replace('e', 'a'); //e yerine a yazar
		System.out.println(katar7);
		System.out.println(katar7.trim());//baştaki boşlukları silmek için
		katar7=katar7.trim();
		katar7=katar7.toUpperCase(); //büyük harfe çevirir.
		System.out.println(katar7); 
		katar7=katar7.toLowerCase(); //küçük harfe çevirir.
		System.out.println(katar7);
		katar7=katar7.replace('a','e');
		/*
		 * StringTokenizer sınıfı
		 * */
		StringTokenizer st1=new StringTokenizer(katar7);
		while(st1.hasMoreTokens()){
			System.out.println(st1.nextToken());
		}
		
	}
}
