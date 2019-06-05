package com.org.File;
import java.io.*;
public class BfrReader {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("/home/nekinci/Masaüstü/file6.txt");
		BufferedReader bf=new BufferedReader(new FileReader(f));
		char dizi[]=new char[(int) f.length()];
		bf.read(dizi);
		bf.close();
		String okunan=new String(dizi);
		System.out.println(okunan);
	}

}
