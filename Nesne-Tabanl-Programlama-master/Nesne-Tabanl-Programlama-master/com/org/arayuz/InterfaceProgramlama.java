package com.org.arayuz;

interface Calisan{
	double oran=0.7; //ücreti hesaplamak için sabit oran.
	double ucret(); //ücreti geri döndürür.
	void calisanBolumu();//Çalışanın bölümü
	void ucretBelirle(double ucretSabiti); //ücreti belirler
}
abstract class isci implements Calisan{
	double ucretSabiti;
	@Override
	public double ucret(){
		return ucretSabiti*oran;
	}
	@Override
	public void calisanBolumu(){
		System.out.println("Ücretli çalışan");
	}
	@Override
	public void ucretBelirle(double ucretSabiti){
		this.ucretSabiti=ucretSabiti;
	}
}
public class InterfaceProgramlama {

	public static void main(String[] args) {
	}
	

}
