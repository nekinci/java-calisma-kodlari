package com.org.dahilisiniflar;

interface fonksiyonlar1{
	public String buyuk(String s);
}
interface fonksiyonlar2{
	public String kucuk();
}
class katar{
	public class uzunluk{
		public int uzunluk(String k){
			return k.length();
		}
	}
	public String buyukHarfeCevir(String s){
		class buyukHarfeCevirme implements fonksiyonlar1{
			String buyuk="";
			@Override
			public String buyuk(String d) {
				buyuk=d.toUpperCase();
				return buyuk;
			}
			
		}
		buyukHarfeCevirme katar1=new buyukHarfeCevirme();
		return katar1.buyuk(s);
	}
	public fonksiyonlar2 kucukHarfeCevir(final String k){
		
		return new fonksiyonlar2(){
			String kucuk="";
			@Override
			public String kucuk() {		
				kucuk=k.toLowerCase();
				return kucuk;
			}
			
		};
	}
		

}

public class deneme {

	public static void main(String[] args) {
				katar s1=new katar();
				System.out.println(s1.buyukHarfeCevir("ahmet"));
				katar.uzunluk s2=new katar().new uzunluk();
				System.out.println(s2.uzunluk("ahmet"));
				katar s3=new katar();
				fonksiyonlar2 s=s3.kucukHarfeCevir("AHMET");
				System.out.println(""+s.kucuk());
				
	}

}
