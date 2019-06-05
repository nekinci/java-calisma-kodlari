package com.org.donguler;

import java.util.Scanner;

public class Ornek {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
			if(i%5==0){
				System.out.println(""+i);
			}
		}
		for(int i=0;i<=100;i++){
			if(i%3==0&&i%7==0)
			{
				System.out.println("Hem 3 Hem 7 ye kalansız bölünen : "+i);
			}
		}
		System.out.println("Kaçıncı üsünü almak istiyorsunuz: ");
		int a=s.nextInt();
		int c=1;
		for(int i=0;i<a;i++){
			c=c*2;
		}
		System.out.println("Sonuç: "+c);
		for(int i=0;i<100;i++)
		{
			if(i%2==1)
			{
				System.out.println("1 den 100 e kadar olan sayilar: "+i);
			}
		}
	}
}
