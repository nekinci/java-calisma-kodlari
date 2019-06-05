package com.org.File;

import java.io.File;
import java.io.IOException;
public class FileSon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("/home/nekinci/Masaüstü/deneme.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f.exists()){
			//böylebir dosya var ise
			System.out.println("Dosya adı: "+f.getName());
			System.out.println("Dosya yolu: "+f.getAbsolutePath());
			System.out.println("Dosya boyutu: "+f.getTotalSpace());
			System.out.println("Dosya okunabilirmi: "+f.canRead());
		}
	}

}
