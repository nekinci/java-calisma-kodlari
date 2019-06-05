package com.org.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class calisan implements Serializable { //implement işlemi
	private String ad;
	private String soyad;
	public calisan(String ad,String soyad){
		this.ad=ad;
		this.soyad=soyad;
	}
	public String getAd(){
		return ad;
	}
	public String getSoyad(){
		return soyad;
	}
}
public class Serilestirme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calisan isci=new calisan("Mehmet", "Kirazlı");
		ObjectOutputStream o1=null;
		FileOutputStream f1=null;
		try{
			f1=new FileOutputStream("/home/nekinci/Masaüstü/bilgiler.txt");
			//dosya yolu verildi.
			o1=new ObjectOutputStream(f1);
			o1.writeObject(isci); //isci nesnesi dosyaya yazildi.
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(o1 !=null)
					o1.close();
				if(f1 !=null)
					f1.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}

}
