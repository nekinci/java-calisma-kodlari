package com.org.Itrator;
import java.util.*;
public class TreeMapOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tree=new TreeMap();
		tree.put(1, "Bir");
		tree.put(2, "İki");
		tree.put(3, "Üç");
		tree.put(4, "Dört");
		tree.put(5, "Beş");
		tree.put(2, "İki");
		System.out.println("Tüm veriler: "+tree);
		System.out.println("3 veya 3den sonraki en büyük veri çifti "+tree.ceilingEntry(3));
		System.out.println("Azalan şekilde anahtar Sıralar: "+tree.descendingKeySet());
		System.out.println("7 veya 7den küçük veri çifti: "+tree.floorEntry(7));
		System.out.println("4den küçük olan anahtar veri tipleri: "+tree.headMap(4));
		System.out.println("3den büyük olan anahtar veri çiftleri: "+tree.higherEntry(3));
		System.out.println("2den küçük olan anahtar değeri: "+tree.lowerKey(2));
		System.out.println("Map içersindeki son veri silinecek: "+tree.pollLastEntry());//first içinde aynısı geçerli.
		System.out.println("2 ile 4 arasındaki: "+tree.subMap(2, 5));
		System.out.println("4 ve 4den büyük olan anahtar çiftleri: "+tree.tailMap(4));
	}

}
