package com.org.Itrator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


class isci{
	String ad,soyad;
	int maas;
	
}
public class Odev2 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<isci> list = new ArrayList<isci>();
		isci is[]=new isci[2];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++){
			System.out.print("Ad: ");s.next();
			System.out.print("Soyad: ");s.next();
			System.out.print("Maas: ");s.nextInt();
			list.add(is[i]);
			System.out.println(list.add(is[i]));
		}
		System.out.println(list.get(0).ad);
	}

}
