package com.org.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isBs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStreamReader is=new InputStreamReader(System.in); //System girişini parametre alan akış okuyucu
			BufferedReader br= new BufferedReader(is); //akış okuyucuyu parametre alan bufferedreader
			System.out.println("Birşeyler yazin... ");
			String deger;
			deger = br.readLine();
			System.out.println("Girilen: "+deger);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
