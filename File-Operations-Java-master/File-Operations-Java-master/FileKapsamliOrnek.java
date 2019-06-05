package com.org.File;
import java.io.*;
public class FileKapsamliOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/file3.txt");
		File f2=new File("/home/nekinci/Masaüstü/file4.txt");
		char [] veriler=new char[(int) f.length()];
		try{
			FileReader fr=new FileReader(f);
			fr.read(veriler);
			String okunan=new String(veriler);
			fr.close();
			FileWriter fw= new FileWriter(f2);
			fw.write(okunan);
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
