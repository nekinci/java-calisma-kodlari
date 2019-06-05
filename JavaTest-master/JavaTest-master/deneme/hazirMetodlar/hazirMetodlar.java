package deneme.hazirMetodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hazirMetodlar {
	public static void main(String[] args)
	{
		int [] dizi=new int[]{5,7,1,3,9,7,4,5};
		int [] dizi2=new int[]{5,7,1,3,9,7,4,5};
		Integer dizi3[]={22,44,66,88};
		String dizi4[]={"Ahmet","Mehmet","2012"};
		Arrays.sort(dizi); //diziyi küçükten büyüğe sıraladı.
		Arrays.sort(dizi2);
		int sonuc = Arrays.binarySearch(dizi, 1); // dizide 1 aradı.
		if(sonuc<0)
			System.out.println("Bulunamadi");
		else
			System.out.println(sonuc+" dizininde bulundu!");
		System.out.println(Arrays.equals(dizi, dizi2)); //dizi ile dizi2 uzunluk ve eleman bakımından karşılaştırıldı.
		System.out.println("Dizinin uzunluğu : "+dizi.length);
		/**/
		
		
	}
}
