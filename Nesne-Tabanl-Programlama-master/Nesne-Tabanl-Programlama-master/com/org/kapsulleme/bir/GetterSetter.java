package com.org.kapsulleme.bir;

public class GetterSetter {
	private int deger; //private değişken tanımlandı.
	private String ad;
	public int getDeger(){ //getter mod yani okuyabilme modu.
		return deger;}
	public void setDeger(int deger){ //setter mod yani değiştirebilme modu.
		this.deger=deger;
	}
	public String getAd(){ //getter mod
		return ad;
	}
	public void setAd(String ad){
		this.ad=ad;
	}
	public static void main(String[] args) {
		GetterSetter n1=new GetterSetter();
		n1.setDeger(5);
		n1.setAd("Niyazi");
		System.out.println(n1.getAd());
		System.out.println(n1.getDeger());
		n1.setAd("Artık Niyazi Değil");
		System.out.println(n1.getAd());
		n1.setDeger(10);
		System.out.println(n1.getDeger());
		n1.setAd("Şimdi yine Niyazi Oldu");
		System.out.println(n1.getAd());
		n1.setDeger(5);
		System.out.println(n1.getDeger());
	}

}
