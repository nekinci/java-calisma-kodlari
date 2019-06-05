package com.org.tryCatch;

import java.util.Scanner;

class KarakterException extends Exception{
	public KarakterException(){
		
	}
	String hataTuru="Karakter Hatası";
	String hataMetni="Sadece büyük harf girilmelidir";
	public String toString(){
		hataTuru+=String.format(": "+hataMetni);
		return hataTuru;
	}
}
public class buyukHarfAlan {

	public char buyukHarfAl(char c) throws KarakterException{
		char x='A';
		for(int i=0;i<26;i++)
		{
			if(c==(x+i))
				return c;
		}
		throw new KarakterException();
	}
	public static void main(String[] args) {
		buyukHarfAlan bha=new buyukHarfAlan();
		Scanner s=new Scanner(System.in);
		char d;
		try{
			d=bha.buyukHarfAl('s');
		}
		catch(KarakterException kh){
			System.out.println(kh.toString());
		}
	}

}
