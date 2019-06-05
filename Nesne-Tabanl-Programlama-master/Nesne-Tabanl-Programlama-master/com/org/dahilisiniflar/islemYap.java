package com.org.dahilisiniflar;

public class islemYap {
	class dahiliSinif{
		public int x=5;
		public static final int y=5;//sabit olduğu için tanımlanır.
		//public static String ad="mustafa"; //tanımlanamaz
//		public static void metod1(){
//			//static olmayan sınıf içerisine static olan bir metod tanımlanamaz.
//		}
		
	}
	static class dahiliSinif2{
		public int a=11; //static sınıf içerisine static olmayan değişken tanımlanabilir.
		public static final int b=23;
		public static String ad="Emre";//static sınıf içerisine static String tanımlanabilir;
		String ad1="Emre";// static sınıf içerisine static olmayan String tanımlanabilir.
		public static void metod2(){
			//static metod tanımlanabilir.
		}
		public void metod3(){
			//static olmayan metod tanımlanabilir.
		}
	}
}
