package com.org.File;

import java.io.*;

public class bfos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/file6.txt");
		try{
			BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(f));
			bf.write("Java'yı çok seviyorum".getBytes());
			bf.flush();
			bf.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
