package com.org.Itrator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class mepArayuz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hash= new HashMap(10,0.75f);
		hash.put("Bir", 1);
		hash.put("İki", 2);
		hash.put("Üç", 3);
		hash.put("Dört",4);
		hash.put("Beş", 5);
		hash.put("Altı", 6);
		
		Set veri=hash.entrySet();
		Set anahtar=hash.keySet();
		
		System.out.println("Hashmapın öğeleri: ");
		Iterator i=veri.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		Iterator it=anahtar.iterator();
		System.out.println("Anahtarları: ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
