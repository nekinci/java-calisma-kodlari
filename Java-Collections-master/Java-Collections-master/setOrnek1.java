package com.org.Itrator;
import java.util.*;
public class setOrnek1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kopya eleman bulunduran dizi oluşturuldu.
		String [] a={"Ali","Ahmet","Mehmet","Fatma","Ali"};
		boolean check;
		HashSet hs=new HashSet();
		for(String s: a){
			check=hs.add(s);
			if(!check)
				System.out.println("Kopya eleman bulundu! : "+s);
		}
		Iterator i=hs.iterator();
		while(i.hasNext()){
			System.out.println("Sıradaki eleman: "+i.next());
		}
	}

}
