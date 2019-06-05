package com.org.File;

import java.io.File;
import java.io.IOException;

public class FileSınıfıIleriOrnekler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path="/home/nekinci/Masaüstü";
		File f=new File(path+"/veriler.txt");
		File f1=new File(path+"/ekinci.txt");
		try{
			f.createNewFile();
			f1.createNewFile();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		f.renameTo(f1); //yeniden isimlendirdik.
		if(f1.canWrite()==true&&f1.canRead()==true) //canWrite() yazma kontrolü canRead() okuma kontrolü
			System.out.println("Hem yazılabilir,hem okunabilir.");
	}

}
