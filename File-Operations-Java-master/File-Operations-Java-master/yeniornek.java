package com.org.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class musteri{
	int hspNo;
	String isim,soyisim;
	double bakiye;
	protected void yeniKayit(File f1) throws IOException{
		RandomAccessFile rnd=new RandomAccessFile(f1,"rw");
		System.out.println("Hesap numarasını girin: ");
		int accountNumber=new Scanner(System.in).nextInt();
		rnd.seek(accountNumber);
	}
	protected void kayitSil(File f1){
		
	}
	protected void kayitGuncelle(File f1){
		
	}
	protected void metinDosyasi(File f1) throws Exception{
		RandomAccessFile rnd = new RandomAccessFile(f1, "rw");
		musteri m1=new musteri(0,"","",0.0);
		rnd.writeBytes("Hesap No.  Soyisim     İsim     Bakiye");
		rnd.close();
		while(f1!=null){
			if(m1.hspNo!=0){
				 
			}
		}
		
	}
	protected int secimGir(){
		return 1;
	}
	public musteri(int hspNo,String isim,String soyisim,double bakiye){
		this.isim=isim;
		this.hspNo=hspNo;
		this.soyisim=soyisim;
		this.bakiye=bakiye;
	}
	public musteri(){
		
	}
}
public class yeniornek {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File mk=new File("/home/nekinci/Masaüstü/Banka");
		mk.mkdir();
		File f=new File("/home/nekinci/Masaüstü/Banka/banka.zrt");
		
	}

}
