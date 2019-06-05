package deneme.diziler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dizilereGiris {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int dizi[]=new int[]{12,24,4,5,8,10};
		int [] dizi2=new int[dizi.length];
		System.arraycopy(dizi, 0, dizi2, 0, dizi.length); // ilk arg kaynak dizi,ikinci arg kaçıncı indisten itibaren
		for(int i:dizi2)				//3ncu arg hedef dizi,4uncu arg kac tane
			//System.out.println(i); //foreach kullanimi
		//Arrays.sort(dizi);
		Arrays.sort(dizi2,0,2);
		for(int i:dizi2)
			System.out.println(i);
		

	}

}
