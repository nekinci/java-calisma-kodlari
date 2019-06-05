package com.org.Itrator;
import java.util.*;
public class linkedHashMapOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap lhm = new LinkedHashMap();
		//ASCII tablosundaki 65-90 arasındaki değerler
		for(int i=65;i<=90;i++){
			lhm.put((char)i, i); //ilki anahtar ikinci si değer.
		}
		Set anahtarlar=lhm.keySet();
		System.out.println("LinkedHashMap öğeleri: ");
		System.out.println(lhm);
		System.out.println("LinkedHashMap anahtarları: ");
		System.out.println(anahtarlar);
	}

}
