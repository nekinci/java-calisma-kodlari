package com.org.tryCatch;

import java.util.Scanner;

public class birOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] dizi=new int[]{1,3,5,7,9};
		try{
			System.out.println(dizi[1]);
			System.out.println(dizi[7]);
		}
		catch(Exception e){
			System.out.println("Bir hata ile karşılaşıldı "+e.toString());
		}
		Scanner s=new Scanner(System.in);
		System.out.println("Notunuzu girin");
		int not;
		try{
			not=s.nextInt();
		}
		catch(Exception e){
			System.out.println("Yolunda gitmeyen birşeyler var lütfen tekrar deneyin::. "+e.toString());
		}

	}

}
