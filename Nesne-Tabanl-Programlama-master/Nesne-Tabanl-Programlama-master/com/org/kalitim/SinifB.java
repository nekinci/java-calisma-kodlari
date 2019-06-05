package com.org.kalitim;
class SinifA{
	protected int sayi=6;
	public String ad="Niyazi";
	public String metod(){
		return ad+sayi;
	}
}
class sinifC extends SinifA{
	public String metod(){ //sınıfA nın metodunu override ediyor yani o sınıftaki metod yerine kendi metodunu
		return ad+sayi+ad; //kullanıyor.
		/*--
		 * Kurallar--
		 * 1)Override edilecek metodun dönüş tipi parametre sıra ve listelerinden en az biri farklı olmalıdır.
		 * 2)Sub-class(alt sınıf)taki metodun kapsüllemesi üst sınıfınkinden yüksek olmalıdır.
		 * 		örn, SinifA nın kapsülü-> protected SinifC nin kapsülü->public gibi;
		 * 		Overloading ve Overriding farkı
		 * 			Overriding->Dönüş tipi aynı Parametre sıra ve listesi aynı
		 * 			Overloading->Dönüş tipi,parametre sırası ve listesinden en az biri farklı.
		 * */
	}
}
public class SinifB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sinifC d=new sinifC();
		SinifA e=new SinifA();
		System.out.println(d.metod());
		System.out.println(e.metod());
	}

}
