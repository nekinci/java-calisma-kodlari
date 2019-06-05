package com.org.donguler;

import java.util.Scanner;

public class FibonacciDiziler {
	public static void main(String[] args)
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("Kaçıncı fibonacci sayısına kadar görmek istiyorsunuz: ");
		
		a=s.nextInt();
		int [] fibonacci=new int[a+10];
		fibonacci[0]=0;
		fibonacci[1]=1;
		for(int i=0;i<a;i++)
		{
			fibonacci[i+2]=fibonacci[i+1]+fibonacci[i];
			System.out.println((i)+"ncı fibonacci sayısı: "+fibonacci[i]);
		}
		
	}

}
