package deneme.hazirMetodlar2;

import java.util.Arrays;

public class denemeee {
	static int tek=0,cift=0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] dizi=new int[5];
		degistir(dizi);
		//for(int i: dizi)
		//	System.out.println(i);
		tek_cift(dizi);

			dizi[0]=dizi[0]+dizi[1]+dizi[2]+dizi[3];
			dizi[1]=dizi[0]*dizi[1]*dizi[2]*dizi[3];
			dizi[2]=tek;
			dizi[3]=cift;
		for(int i:dizi)
			System.out.println(i);
		
	}
	public static void degistir(int[] dizi)
	{
		for(int i=0;i<dizi.length;i++){
			dizi[i]=i+5;
		}
	}
	public static void tek_cift(int[] dizi)
	{
		for(int i=0;i<dizi.length;i++)
		{
			if(dizi[i]%2==0){
				cift+=dizi[i];
				}
			else
				tek+=dizi[i];
			
		}
	}

}
