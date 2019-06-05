package com.org.deneme;

import java.util.Scanner;

class numberException extends Exception{
	public numberException(){}//constructor build
	@Override
	public String toString(){
		return "Hata: Sayı girmelisiniz.";
	}
	
}

public class odev {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);String tmp;int x;
		try{
			while(true){
				tmp=s.nextLine();
				System.gc();
				x=Integer.parseInt(tmp);
			}
			
		}catch(Exception ne){
			System.out.println(ne.toString());
		}
	}

}
