package com.org.tryCatch;

public class throwsKullanimi {
	public void metod1() throws Exception{
		int dizi[]=new int[]{2,3,5};
		System.out.println("Burası metod1dir");
		System.out.println(dizi[3]);
	}
	public void metod1Cagir(){
		System.out.println("Burası metod1i çağırır.");
		try{
			metod1();
		}catch(Exception ex){
			System.out.println(ex.toString());
		}
		System.out.println("Metod1 çağrıldı");
		
	}

	public static void main(String[] args) {
		throwsKullanimi th=new throwsKullanimi();
		th.metod1Cagir();
		System.out.println("Metod1Çağr() çağrıldı");
		
	}

}
