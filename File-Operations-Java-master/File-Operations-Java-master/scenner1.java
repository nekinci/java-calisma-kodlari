package com.org.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class scenner1  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/file6.txt");
		try{
			Scanner s=new Scanner(f);
			while(s.hasNextInt()){
				int sayi=s.nextInt();
				if(sayi%2==0)
					System.out.println(sayi);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
