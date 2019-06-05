package com.org.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Fil28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/OBS/ogrenci.txt");
		FileReader fr= new FileReader(f);
		int c=fr.read();
		while(c!=-1){
			System.out.print((char)c);
			c=fr.read();
		}
		fr.close();
		f=new File("/home/nekinci/Masaüstü/OBS/ogrenci.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		System.out.println(br.readLine());
		br.close();
	}

}
