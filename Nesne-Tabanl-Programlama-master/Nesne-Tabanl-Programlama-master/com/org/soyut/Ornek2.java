package com.org.soyut;


abstract class  Medya{
	String medyaBasligi;
	int cikisYili;
	int satisAdedi;
	public abstract void isim(String medyaBasligi);
	public abstract void yil(int cikisYili);
	public abstract void adet(int satisAdedi);
	public abstract void yazdir();
}
class Muzik extends Medya{
	String sanatci;
	public void isim(String medyaBasligi){
		this.medyaBasligi=medyaBasligi;
	}
	public void yil(int cikisYili){
		this.cikisYili=cikisYili;
	}
	public void adet(int satisAdedi){
		this.satisAdedi=satisAdedi;
	}
	public void sanatciAdi(String sanatci){
		this.sanatci=sanatci;
	}
	public void yazdir(){
		System.out.println("Müziğin Sanatçısı: "+this.sanatci);
		System.out.println("Müziğin adı: "+this.medyaBasligi);
		System.out.println("Müziğin çıkış yılı: "+this.cikisYili);
		System.out.println("Müziğin satış adeti: "+this.satisAdedi);
	}
}
class Film extends Medya{
	String yonetmen;
	public void isim(String medyaBasligi){
		this.medyaBasligi=medyaBasligi;
	}
	public void yil(int cikisYili){
		this.cikisYili=cikisYili;
	}
	public void adet(int satisAdedi){
		this.satisAdedi=satisAdedi;
	}
	public void sanatciAdi(String yonetmen){
		this.yonetmen=yonetmen;
	}
	public void yazdir(){
		System.out.println("Filmin yönetmeni: "+this.yonetmen);
		System.out.println("Filmin adı: "+this.medyaBasligi);
		System.out.println("Filmin çıkış yılı: "+this.cikisYili);
		System.out.println("Filmin izlenme adedi : "+this.satisAdedi);
	}
	public Film(){
		
	}
	public Film(String yonetmen,String medyaBasligi,int cikisYili,int satisAdedi){
		isim(medyaBasligi);
		yil(cikisYili);
		sanatciAdi(yonetmen);
		adet(satisAdedi);
		yazdir();
	}
}
public class Ornek2{
	
	public static void main(String [] args){
		
		Muzik yarem=new Muzik();
		yarem.isim("Yarem");
		yarem.sanatciAdi("Norm Ender");
		yarem.yil(2016);
		yarem.adet(1500);
		yarem.yazdir();
		Film film1=new Film("Niyazi Ekinci","Çok güzel bir Film",2018,1000000);
		
	}
}