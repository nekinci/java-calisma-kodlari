package com.org.File;
import java.io.*;
public class BfferOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File f=new File("/home/nekinci/Masaüstü/file5.txt");
			FileReader fr=new FileReader(f);//bu yolu argüman alır.Fileı
			BufferedReader br=new BufferedReader(fr);//bu fileReaderi argüman alır.
			String satir=br.readLine(); //satır okuduk satır değişkenine aktardık.
			while(satir!=null) //satır boş olmadığı(null) sürece devem et
			{
				System.out.println(satir);
				satir=br.readLine();
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
