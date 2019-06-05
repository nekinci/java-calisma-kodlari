package com.org.kapsulleme.iki;

public class GetterSetter1 {

	private int kmSayaci;
	private String ruhsatSahibi;
	public int getKmSayaci(){
		return kmSayaci;
	}
	public String getruhsatSahibi(){
		return ruhsatSahibi;
	}
	public void setKmSayaci(int kmSayaci){
		this.kmSayaci=kmSayaci;
	}
	public void setruhsatSahibi(String ruhsatSahibi){
		this.ruhsatSahibi=ruhsatSahibi;
	}
	public GetterSetter1(int kmSayaci,String ruhsatSahibi){
		//this.kmSayaci=kmSayaci; //bu kullanimlarda doğru fakat constructure metodlada işimizi halledebilirdik
		//this.ruhsatSahibi=ruhsatSahibi;
		setKmSayaci(kmSayaci);
		setruhsatSahibi(ruhsatSahibi);//setter metodlar
	}
	public static void main(String[] args) {
		GetterSetter1 araba=new GetterSetter1(1050,"Niyazi");
		//araba.setKmSayaci(1000);
		//araba.setruhsatSahibi("Niyazi Ekinci");
		System.out.println(araba.getKmSayaci());
		System.out.println(araba.getruhsatSahibi());
	}

}
