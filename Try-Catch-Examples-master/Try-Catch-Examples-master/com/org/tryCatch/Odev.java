package com.org.tryCatch;

import java.util.Scanner;

class XCharException extends Exception{
	String exceptionType="XCharException";
	String exceptionText="Input the letter only,please!";
	
	
	public XCharException(){}//constructor build
	public String toString(){
		exceptionType+=String.format(": "+exceptionText);
		return exceptionType;
	}
}
public class Odev {
	public char degerAl(char c) throws XCharException
	{
		char x='a';
		char y='A';
		for(int i=0;i<26;i++){
			if(c==(x+i)||c==(y+i))
				return c;
		}
		throw new XCharException();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odev o=new Odev();
		Scanner s=new Scanner(System.in);
		char d;
		try{
			d=o.degerAl('l');
			System.out.println(d);
		}catch(XCharException xce){
			System.out.println(xce.toString());
		}
	}

}
