package com.org.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
public class FileOutputStream11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File yol=new File("/home/nekinci/Masaüstü/file5.txt");
		try{
			//yazma işlemleri
			java.io.FileOutputStream yazdir=new java.io.FileOutputStream(yol); //yazıcı tanımladık.
			String metin="Fileoutputstream ile yazdirma java.io yu öylsesine yazdım";
			byte veriler[]=metin.getBytes(); //veriler adlı diziye metini byte olarak aktardık.
			yazdir.write(veriler); //veriler adlı diziyi yazdır dedik.
			yazdir.close();//dosya kapatıldı.
			//okuma işlemleri
//			char okunacak[]=new char[(int) yol.length()];
//			FileReader f2= new FileReader(yol);
//			f2.read(okunacak);
//			String okunan = new String(okunacak);
//			System.out.println(okunan);
			//ekstra okuma işlemleri
			byte [] okunacak= new byte[(int) yol.length()];
			FileInputStream fs=new FileInputStream(yol);
			fs.read(okunacak);
			fs.close();
			String okunan = new String(okunacak);
			System.out.println(okunan);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
