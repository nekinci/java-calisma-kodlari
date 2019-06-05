package com.org.Itrator;

import java.util.LinkedList;

public class LinkedListOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls=new LinkedList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.addFirst(4);
		ls.addLast(0);
		System.out.println("Tüm elemanlar: "+ls);
		System.out.println("İlk eleman: "+ls.getFirst());
		System.out.println("Son eleman: "+ls.getLast());
	}

}
