package com.org.dahilisiniflar;

import java.util.ArrayList;

class InnerrClass{
	public class asalSayi{
		public boolean asalSayiMetodu(int asalSayi){
			int bolen=0;
			boolean kontrol;
			for(int i=2;i<asalSayi;i++){
				if(asalSayi%i==0)
					bolen++;
			}
			if(bolen!=0)
				kontrol=false;
			else
				kontrol=true;
			return kontrol;
		}
	}
	protected class mukemmelSayiMetodu{
		protected boolean mukemmelSayi(int mukemmelSayi){
			int bolenToplam=0;
			boolean check;
			for(int i=1;i<mukemmelSayi;i++){
				if(mukemmelSayi%i==0){
					bolenToplam+=i;
				}
			}
			if(bolenToplam==mukemmelSayi)
				check=true;
			else
				check=false;
			return check;
		}
	}
	protected class fibonacciSerisi{
	protected ArrayList fibonacciSerisiMetodu(int elemanSayisi){
		ArrayList<Integer> fibonacci=new ArrayList<Integer>();
		fibonacci.add(0, 1);
		fibonacci.add(1, 1);
		for(int i=0;i<elemanSayisi-2;i++){
			fibonacci.add(i+2,fibonacci.get(i)+fibonacci.get(i+1));
		}
		return fibonacci;
		
	}
}
	}
public class YeniOrnek {
	public static void main(String[] args){
		InnerrClass.asalSayi asal=new InnerrClass().new asalSayi();
		System.out.println(asal.asalSayiMetodu(5));
		InnerrClass.mukemmelSayiMetodu mukemmel=new InnerrClass().new mukemmelSayiMetodu();
		System.out.println(mukemmel.mukemmelSayi(6));
		InnerrClass.fibonacciSerisi fibo=new InnerrClass().new fibonacciSerisi();
		System.out.println(fibo.fibonacciSerisiMetodu(5));
	}
}
