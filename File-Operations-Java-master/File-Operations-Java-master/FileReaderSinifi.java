package com.org.File;
import java.io.*;

public class FileReaderSinifi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/file1.txt"); //yeni bir dosya oluşturmak için yol verdik.
		char[] dosya=new char[(int) f.length()]; //dosyadaki verileri tutmak için dizi tanımladık.File sınıfı char olarak tutar.
		try{ 
			f.createNewFile();			//Yeni dosyamızı try-catch bloğunda oluşturduk.
		}catch(IOException e){
			e.printStackTrace();
		}
		try {
			FileReader fr=new FileReader(f); //dosya okuma sınıfını oluşturduk ve yapıcısına dosya değişkenimizi verdik.
			fr.read(dosya); //fr (fileReader) değişkenine read metodunu çağırdık ve okuduğunu diziye aktar dedik.
			String okunan =new String(dosya); //string tanımladık ve char daki bilgileri atadık
			System.out.println(okunan); //eğer dosya da birşey yoksa boşsa geriye -1 değer döner
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
