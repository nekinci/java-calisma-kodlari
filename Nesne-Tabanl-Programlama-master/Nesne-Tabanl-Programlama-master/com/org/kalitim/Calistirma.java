package com.org.kalitim;

class Telefon{
	public  Telefon(){
		System.out.println("Telefon class'ının yapıcısı");
	}
}
class akilliTelefon extends Telefon{
	public akilliTelefon(){
		System.out.println("Akıllı telefon class'ının yapıcısı");
	}
}
class cepTelefonu extends Telefon{
	public cepTelefonu(){
		System.out.println("Cep telefonu class'ının yapıcısı");
	}
}
class Nokia extends cepTelefonu{
	public Nokia(){
		System.out.println("Nokia class'ının yapıcısı");
	}
}
public class Calistirma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nokia n8=new Nokia();
		
	}

}
