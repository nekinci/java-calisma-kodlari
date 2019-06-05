package com.org.dahilisiniflar;

interface fonksiyonlar{
	public double faktoriyelAl(double sayi); //interface tanımı
}
class yerelSinifOrnegi{
	public double faktoriyel(double sayi){
		double sonuc;
		class faktoriyelAlma implements fonksiyonlar{
			//yerel sınıf tanımı
			private double sonuc2=1;
			@Override
			public double faktoriyelAl(double sayi2){
				for(int i=1;i<=sayi2;i++){
					sonuc2*=i;
				}
				return sonuc2;
			}
		}
		faktoriyelAlma f=new faktoriyelAlma(); //metod içinde nesne oluşturduk.
		sonuc=f.faktoriyelAl(sayi);
		return sonuc;
	}
}

public class yerel {

	
	public static void main(String[] args) {
		yerelSinifOrnegi y=new yerelSinifOrnegi();
		System.out.println("5in faktöriyeli : "+y.faktoriyel(5));
	}

}
