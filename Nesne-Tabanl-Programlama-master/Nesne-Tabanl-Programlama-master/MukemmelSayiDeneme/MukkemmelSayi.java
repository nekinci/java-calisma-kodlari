package MukemmelSayiDeneme;

import java.util.Scanner;

public class MukkemmelSayi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int result1=0;
		int a=s.nextInt();
		for(int i=1;i<a-1;i++){
			if(a%i==0){
				result1+=i;
			}
		}
		if(a==result1)
			System.out.println("Mükemmel Sayi");
	}

}
