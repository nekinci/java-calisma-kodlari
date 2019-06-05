package com.org.File;
import java.io.*;
import java.util.Scanner;

class ogrenci{
	String ogrNo,ad,soyad,telefon,adres,dersAdi;
	int not;
	public ogrenci(){
		
	}

	public void ogrEkle(String ogrNo,String ad,String soyad,String telefon,String adres,String dersAdi,int not){
		this.ad=ad;
		this.soyad=soyad;
		this.telefon=telefon;
		this.adres=adres;
		this.dersAdi=dersAdi;
		this.not=not;
		System.out.println("Öğrenci bilgileri oluşturuldu.");
	}

}
public class Odev {
	public static void dosyalariOlustur(File f1,File f2){
		File klasor=new File("/home/nekinci/Masaüstü/OBS");
		klasor.mkdir();
		f1=new File("/home/nekinci/Masaüstü/OBS/ogrenci.txt");
		f2=new File("/home/nekinci/Masaüstü/OBS/not.txt");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Sınıf mevcudunu girin: ");
		int siniflength=s.nextInt();
		ogrenci sinif[] = new ogrenci[siniflength];
		String ogrNo,ad,soyad,telefon,adres,dersAdi;
		int not;
		File ogrenci = null,not1=null;
		dosyalariOlustur(ogrenci, not1);
		for(int i=0;i<siniflength;i++){
			System.out.println("Öğrenci numarasını girin: ");ogrNo=s.nextLine();
			System.out.println("Adını girin: ");ad=s.nextLine();
			System.out.println("Soyadını girin: ");soyad=s.nextLine();
			System.out.println("Telefonu girin: ");telefon=s.nextLine();
			System.out.println("Adresi girin: "); adres=s.nextLine();
			System.out.println("Ders adını girin: ");dersAdi=s.nextLine();
			System.out.println("Notu girin: ");not=s.nextInt();
			sinif[i].ogrEkle(ogrNo, ad, soyad, telefon, adres, dersAdi, not);
		}
	}

}
