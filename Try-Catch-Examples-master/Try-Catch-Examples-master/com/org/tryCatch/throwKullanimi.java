package com.org.tryCatch;

import java.util.Scanner;

public class throwKullanimi {
	
	public static int sayiBol(int sayi1,int sayi2){
		if(sayi2==0)
			throw new ArithmeticException("0'a bölme hatası");
		return sayi1/sayi2;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Birinci sayıyı,ardından ikinci sayıyı girin: ");
			int sayi1=s.nextInt(),sayi2=s.nextInt();
			int sonuc;
			sonuc=sayiBol(sayi1,sayi2);
			System.out.println("Sonuç: "+sonuc);
		}
		catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}

	}

}
