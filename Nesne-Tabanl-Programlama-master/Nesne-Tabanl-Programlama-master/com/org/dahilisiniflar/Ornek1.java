package com.org.dahilisiniflar;

public class Ornek1 {
	public class dahiliUyeSinif{
		private int x,y;
		public dahiliUyeSinif(int x,int y ){
			this.x=x;
			this.y=y;
		}
		public void carp(){
			System.out.println("Çarpma sonucu: "+(x*y));
		}
	}
	public static class dahiliUyeSinif2{
		public static void topla(int sayi1,int sayi2){
			System.out.println("Toplama Sonucu: "+(sayi1+sayi2)); //static sınıf içerisindeki static metod 
		}														// nesne olmadanda çalıştırılabilir.
	}
	public static void main(String[] args){
		Ornek1.dahiliUyeSinif a=new Ornek1().new dahiliUyeSinif(5, 6);
		a.carp();
		dahiliUyeSinif2.topla(5, 6);
	}
}
