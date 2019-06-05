package c.o;

import java.util.Scanner;

public class sss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int a=s.nextInt();
		int toplam=0;
		for(int i=1;i<=a;i++){
			toplam+=kareAl(i);
			
		}
		System.out.println(toplam);
	}
	public static int kareAl(int a){
		return a*a;
	}

}
