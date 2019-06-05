package com.org.Itrator;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHSetOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashSet nesnemizi oluşturduk.
		LinkedHashSet<String> lHs=new  LinkedHashSet<String>();
		lHs.add("Ali");
		lHs.add("Ahmet");
		lHs.add("Mehmet");
		lHs.add("Fatma");
		Iterator<String> i=lHs.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
