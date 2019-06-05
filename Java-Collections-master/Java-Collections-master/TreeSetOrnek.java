package com.org.Itrator;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet collection object build.
		TreeSet ts=new TreeSet();
		ts.add("istanbul");
		ts.add("antalya");
		ts.add("kırklareli");
		ts.add("edirne");
		Iterator i=ts.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("kırklareli")); // önceki elemanları listeler.
		System.out.println(ts.subSet("antalya", "kırklareli")); //aralıktakini sıralar. son eleman dahil değil.
	}

}
