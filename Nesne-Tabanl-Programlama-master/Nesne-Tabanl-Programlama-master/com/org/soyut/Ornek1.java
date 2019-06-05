package com.org.soyut;

abstract class sporcu{
	int maas,basari;
	String takim;
	public void bilgiAl(int maas,int basari,String takim){
		this.maas=maas;
		this.basari=basari;
		this.takim=takim;
	}
	public void yazdir(){
		System.out.println("Takımı: "+this.takim);
		System.out.println("Maaşı: "+this.maas);
		System.out.println("Başarısı: "+this.basari);
	}
}
class futbolcu extends sporcu{
	public futbolcu(int maas,int basari,String takim){
		super.bilgiAl(maas, basari, takim);
		System.out.println("....Futbolcu....");
		super.yazdir();
	}
}
class basketbolcu extends sporcu{
	public basketbolcu(int maas,int basari,String takim){
		super.bilgiAl(maas, basari, takim);
		System.out.println("...Basketbolcu...");
		super.yazdir();
	}
}

public class Ornek1 {
	public static void main(String[] args){
		futbolcu alexDeSouza = new futbolcu(1500,1,"Fenerbahçe");
	}
}
