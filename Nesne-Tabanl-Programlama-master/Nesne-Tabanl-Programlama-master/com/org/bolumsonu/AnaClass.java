package com.org.bolumsonu;

import javax.swing.JOptionPane;

class isci{
	private String ad;
	private String soyad;
	private int maas;
	private String sehir;
	private String gorev;
	public isci(String ad,String soyad,int maas,String sehir,String gorev){
		this.ad=ad;
		this.soyad=soyad;
		this.maas=maas;
		this.sehir=sehir;
		this.gorev=gorev;
	}
}

public class AnaClass {

	/**
	 * @param args
	 * @author nekinci
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ad,soyad,gorev,sehir;
		int maas;
		ad=JOptionPane.showInputDialog("Ad girin");
		soyad=JOptionPane.showInputDialog("Soyad girin");
		sehir=JOptionPane.showInputDialog("Şehir girin: ");
		gorev=JOptionPane.showInputDialog("Görev girin: ");
		String s=JOptionPane.showInputDialog("Maaş girin: ");
		maas=Integer.parseInt(s);

		isci birey1=new isci(ad,soyad,maas,sehir,gorev);
		JOptionPane.showMessageDialog(null, "Ad"+ad+"Soyad"+soyad+"Maas"+maas+"Şehir"+sehir+"Görev"+gorev);

	}

}
