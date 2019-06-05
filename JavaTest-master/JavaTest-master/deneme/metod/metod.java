package deneme.metod;

import java.sql.Struct;

public class metod {

	/**
	 * @param args
	 */
	static void islemYap(int a,int b)
	{
		if(a%5==0)
			System.out.println(a);
		if(b%5==0)
			System.out.println(b);
	}
	public static void main(String[] args) {
		int c=5,d=10;
		islemYap(c,d);
	}
	static void ekranayaz()
	{
		System.out.println("Ekrana yaz");
	}
	static int carp(int a,int b)
	{
		return a*b;
	}
	
	
}
