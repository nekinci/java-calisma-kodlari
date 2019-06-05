package com.org.tryCatch;

public class Giris {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try{
			
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception ae){
			System.out.println("Beklenmedik bir durum oluştu "+ae.toString());
		}
	}

}
