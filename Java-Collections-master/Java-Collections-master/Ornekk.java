package com.org.Itrator;

import java.util.LinkedList;

class kuyruk {
	private LinkedList list=new LinkedList();
	public void elemanKaydet(Object eleman){
		list.addLast(eleman);
	}
	public Object elemanCek(){
		return list.removeFirst();
	}
	public Object elemanGetir(){
		return list.getFirst();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	

}
class yigit{
	private LinkedList list=new LinkedList();
	public void yigitaEkle(Object eleman){
		list.addFirst(eleman);
	}
	public Object tepeEleman(){
		return list.getFirst();
	}
	public Object yigittanCek(){
		return list.removeFirst();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
}
public class Ornekk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kuyruk queue = new kuyruk();
		yigit stack=new yigit();
		for(int i=1;i<=3;i++){
			stack.yigitaEkle(i);
			queue.elemanKaydet(i);
		}
		System.out.println("Kuyruk elemanları: ");
		while(!queue.isEmpty()){
			System.out.println("Kuyruktan getir: "+queue.elemanGetir());
			System.out.println("Kuyruktan getir ve sil: "+queue.elemanCek());
		}
		while(!stack.isEmpty()){
			System.out.println("En tepedeki eleman: "+stack.tepeEleman());
			System.out.println("Yığıttan çekilen eleman: "+stack.yigittanCek());
		}
	}

}
