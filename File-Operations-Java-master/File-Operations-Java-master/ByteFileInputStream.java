package com.org.File;
import java.io.*;
public class ByteFileInputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/file1.txt");
		try{
			FileInputStream oku=new FileInputStream(f);
			byte dizi[]=new byte[(int) f.length()];
			oku.read(dizi);
			oku.close();
			String okunan=new String(dizi);
			System.out.println(okunan);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
