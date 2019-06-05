package com.org.File;

import java.io.File;
import java.io.IOException;

public class Fiee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/belge1.txt");
		try{
			f.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
