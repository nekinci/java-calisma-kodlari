package com.org.File;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class bfis {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		File f=new File("/home/nekinci/Masaüstü/file6.txt");
		FileInputStream fs=new FileInputStream(f);
		byte dizi[]=new byte[1000];
		BufferedInputStream bs = new BufferedInputStream(fs);
		int okunan=0;
		while((okunan=bs.read(dizi))!=-1){
			String veriler=new String(dizi, 0, okunan);
			System.out.println(veriler);
		}
		bs.close();
	}

}
