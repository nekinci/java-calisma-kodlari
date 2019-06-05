package com.org.eventler;

public class aaaa {
	private static int [] list ={10,20,30,40,50};
	
	public static void mystery(int [] array){
		int tmp=array[array.length-1];
		for(int i=1;i<array.length;i++){
			array[i]=array[i-1];
		}
		array[0]=tmp;
	}
	public static void main(String[] args) {
		mystery(list);
		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+" ");
		}
	}

}
