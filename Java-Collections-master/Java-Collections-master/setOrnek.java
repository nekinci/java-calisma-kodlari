package com.org.Itrator;

import java.util.*;

public class setOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hSet=new HashSet();
		hSet.add("Ahmet");
		hSet.add("Ömer");
		hSet.add("Niyazi");
		hSet.add("Niyazi");
		hSet.add("Uslu");
		hSet.add("Emir");
		hSet.add("Sefa");
		hSet.add("Emre");
		hSet.add("Kürşat");
		hSet.remove("Ahmet");
		hSet.remove("Sefa");
		Iterator i=hSet.iterator();
		while(i.hasNext()) //eleman varmı yokmu check eder.
		{
			System.out.println("Küme elemanı: "+i.next());
		}
	}

}
