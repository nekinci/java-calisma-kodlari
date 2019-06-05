package com.org.Itrator;
import java.util.*;
public class ListOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(6);
		al.add(5);
		al.add(2,3);
		al.set(3, 4);
		System.out.println(al);
		System.out.println(al.get(3));
	}

}
