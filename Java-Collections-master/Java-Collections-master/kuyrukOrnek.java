package com.org.Itrator;

import java.util.LinkedList;
import java.util.Queue;

public class kuyrukOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue kuyruk = new LinkedList();
		kuyruk.add(6);
		kuyruk.add(51);
		kuyruk.add(15);
		//offer le eklerken hata alırsak false döner.
		kuyruk.offer(66);
		while(!kuyruk.isEmpty()){
			System.out.println("Sırada bekleyen eleman: "+kuyruk.peek());
			//kuyruk.poll();
			System.out.println("Sırada bekleyen elemanı getir: "+kuyruk.poll());
		}
	}

}
