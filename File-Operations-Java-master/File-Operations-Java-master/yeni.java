package com.org.File;

import java.io.File;
import java.io.RandomAccessFile;

public class yeni {
	public static void main(String[] args) throws Exception{
		
		File f1=new File("/home/nekinci/Masaüstü/OBS/steamclient.dll");
		RandomAccessFile rnd=new RandomAccessFile(f1,"rw");
		String satir=rnd.readLine();
		while(satir!=null){
			System.out.println(satir);
			satir=rnd.readLine();
		}
	}
}
