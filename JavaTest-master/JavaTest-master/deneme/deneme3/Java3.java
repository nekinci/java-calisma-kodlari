package deneme.deneme3;

import java.util.Scanner;

public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a=0;
		int b=1,toplam=0;
		System.out.println(a+"\n"+b);
		for(int i=0;i<10;i++)
		{
			toplam=a+b;
			a=b;
			b=toplam;
			System.out.println(toplam);
		}
	}

}
