package com.org.File;

import java.util.Scanner;

public class Scenner2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String metin="Java öğrenirken zarluklara katlanıyorum ve öğrenmeyi seviyorum.";
		Scanner s1=new Scanner(metin);
		while(s1.hasNext()){
			String a=s1.next();
			if(a.charAt(1)=='a'){
				System.out.println(a);
			}
		}
	}

}
