package com.org.File;
import java.io.*;
public class bfw {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/file6.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new  BufferedWriter(fw);
		bw.write("Deneme yazısını dosyaya buffer ile yazdırdık.");
		bw.flush();
		bw.close();
	}

}
