package com.org.dahilisiniflar;

class Bilgisayar{
	public class RAM{
		void method1(){
			System.out.println("Dahili Classın (RAM) metodu->method1");
		}
	}
	public class Anakart{
		void method2(){
			System.out.println("Dahili Classın (Anakart) metodu ->method2");
		}
	}
	public class Islemci{
		public Islemci(){
			
		}
		public Islemci(int a,int b){
			System.out.println(method3(5, 15));
			
		}
		int method3(int a,int b){
			return a*b;
		}
	}
}

public class DahiliSinif {
	public static void main(String[] args){
		Bilgisayar.Anakart kart1=new Bilgisayar().new Anakart();
		kart1.method2();
		Bilgisayar d1=new Bilgisayar();
		Bilgisayar.RAM ram1=d1.new RAM();// bu şekildede oluyor.
		ram1.method1();
		Bilgisayar.Islemci islemci=new Bilgisayar().new Islemci(5, 15);
	}
}
