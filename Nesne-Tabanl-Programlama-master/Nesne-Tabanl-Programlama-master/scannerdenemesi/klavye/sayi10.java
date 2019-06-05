package scannerdenemesi.klavye;

import java.util.Scanner;

public class sayi10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sayi,ptoplam=0,pAdet=0,negatifToplam=0;
		float ortalama=0;
		for(int i=0;i<10;i++)
		{
			sayi=s.nextInt();
			if(sayi>0){
				ptoplam+=sayi;
				pAdet++;
			}
			else
				negatifToplam+=sayi;
		}
		ortalama=(float)ptoplam / (float)pAdet;
		System.out.println("Ortalama: "+ortalama+"Toplam: "+negatifToplam);
	}

}
