package com.org.arayuz;

interface Sekil{
	void alan();
	void cevre();
}
class ucgen implements Sekil{
	int taban,yukseklik;
	public void setBilgi(int taban,int yukseklik){
		this.taban=taban;
		this.yukseklik=yukseklik;
	}
	@Override
	public void alan(){
		System.out.println((taban*yukseklik)/2);
	}
	@Override
	public void cevre() {
		
	}
}
class kare implements Sekil{
	int uzunluk;
	public void setBilgi(int uzunluk){
		this.uzunluk=uzunluk;
	}
	public void alan(){
		System.out.println((uzunluk)*uzunluk);
	}
	public void cevre(){
		System.out.println(4*uzunluk);
	}
}
public class GeometrikSekil {

	
	public static void main(String[] args) {
		
		kare d1=new kare();
		d1.setBilgi(5);
		d1.alan();
		d1.cevre();
		
		ucgen d2=new ucgen();
		d2.setBilgi(5, 4);
		d2.alan();
		d2.cevre();
	}

}
