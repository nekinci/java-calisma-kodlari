package com.org.File;

import java.io.File;
import java.io.IOException;

public class FileSinifi {
	public static void main(String[] args){
		File n=new File("/home/nekinci/Masaüstü/belge1.txt");
		System.out.println(n.getName());//belgenin ismini verir
		System.out.println(n.getAbsolutePath());//dosyanın tam yolunu verir.
		//yeni dosya oluşturduk.
		File f=new File("/home/nekinci/Masaüstü/belge2.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.delete(); //dosyayı sildik.
		System.out.println(f.exists());//dosya varmı boolean değer döndürür.
		File f1=new File("/home/nekinci/Masaüstü/Java Dosya İşlemleri1");
		f1.mkdir(); //klasör oluşturduk.
		
	}
}
