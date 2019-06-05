package com.org.File;
import java.io.*;
public class RndmAcsSFile {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/file6.txt");
		RandomAccessFile rf=new RandomAccessFile(f, "rw");
		byte veri=rf.readByte();
		System.out.println((char)veri);
		String satir=rf.readLine();
		System.out.println(satir);
		
		rf.seek(f.length()); //imleç dosya sonuna konumlanır.
		rf.seek(0); //imleç dosya başına konumlanır.
		String satir2=rf.readLine();
		System.out.println(satir2);
	}

}
