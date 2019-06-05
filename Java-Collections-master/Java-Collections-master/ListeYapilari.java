package com.org.Itrator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListeYapilari {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(23);
		al.add(4);
		al.add(13);
		al.add("Niyazi");
		ListIterator li= al.listIterator();
		while(li.hasNext()){
			System.out.println(li.nextIndex()+".nci eleman: "+li.next());
		}
		while(li.hasPrevious()){
			System.out.println(li.nextIndex()+".nci eleman: "+li.previous());
		}
		
	}

}
