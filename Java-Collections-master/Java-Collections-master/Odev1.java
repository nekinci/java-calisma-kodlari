package com.org.Itrator;

import java.util.LinkedList;

class stack{
	private LinkedList list = new LinkedList();
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public Object tepeEleman(){
		return list.getFirst();
	}
	public Object elemanCek(){
		return list.removeFirst();
	}
	public void elemanEkle(Object o){
		list.addFirst(o);
	}
}
public class Odev1 {

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s=new stack();
		for(int i=0;i<=10;i++){
			s.elemanEkle(i);
		}
		System.out.println("Stack(yığıt) elemanları : ");
		while(!s.isEmpty()){
			System.out.println("Eleman: "+s.tepeEleman());
			System.out.println("Çekilip silinen: "+s.elemanCek());
		}
		
	}

}
