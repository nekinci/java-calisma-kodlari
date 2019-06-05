package com.org.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;

class ogrenciler{
	String ogrNo,ad,soyad,telefon,adres,dersAdi;
	int dersNotu;
	public ogrenciler(){
		
	}
	public ogrenciler(String ogrNo,String ad,String soyad,String telefon,String adres,String dersAdi,int dersNotu){
		this.ogrNo=ogrNo;this.ad=ad;this.soyad=soyad;this.telefon=telefon;this.adres=adres;this.dersAdi=dersAdi;
		this.dersNotu=dersNotu;
	}
	public static void yaz(String toplam,File f1) throws Exception{
		FileWriter fw=new FileWriter(f1,true);
		BufferedWriter bfw=new BufferedWriter(fw);
		bfw.write(toplam);
		bfw.close();
	}
	public static void oku(String no,File f1) throws Exception{
		RandomAccessFile rnd=new RandomAccessFile(f1, "r");
		String satir=rnd.readLine();
		while(satir!=null){
			if(rnd.readLine().startsWith(no)){
				rnd.seek(rnd.readLine().indexOf(no));break;}
			satir=rnd.readLine();
			System.out.println(rnd.readLine());
			
		}
		
	}
	public String getToplam(){
		return this.ogrNo+" "+this.ad+" "+this.soyad+" "+this.telefon+" "+this.adres+" "+this.dersAdi+" "+this.dersNotu+"\n";
	}
}
public class bolumSonuCanavari {

	/**
	 * @param args
	 * @author nekinci
	 * @throws Exception 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, Exception {
		// TODO Auto-generated method stub
		File f1=new File("/home/nekinci/Masaüstü/OBS/ogrenci.txt");
		ogrenciler o1=new ogrenciler("85", "Niyazi", "Ekinci", "05325432704", "Alanya", "Fizik", 0);
		ogrenciler.yaz(o1.getToplam(),f1);
		ogrenciler.oku("85",f1);
	}

}
