package deneme.faktoriyel;

import java.util.Scanner;

public class java312 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Faktöriyel hesabı
		Scanner scan=new Scanner(System.in);
		long fact,a=1;
		System.out.println("Kaç faktöriyel:? ");
		fact=scan.nextInt();
		for(int i=1;i<=fact;i++)
		{
			a=a*i;
		}
		System.out.println(a);
	}

}
