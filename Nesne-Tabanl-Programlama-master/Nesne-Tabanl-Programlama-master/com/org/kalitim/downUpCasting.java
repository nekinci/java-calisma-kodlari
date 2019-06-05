package com.org.kalitim;

class canli{
	public void adsoyle(){
		System.out.println("Burası canlı sınıfı");
	}
}
class hayvan extends canli{
	public void adsoyle(){
		System.out.println("Burası hayvan sınıfı");
	}
}
class omurgali extends hayvan{
	public void adsoyle(){
		System.out.println("Burası omurgalı sınıfı");
	}
}
class omurgasiz extends hayvan{
	public void adsoyle(){
		System.out.println("Burası omurgasız sınıfı");
	}
}
public class downUpCasting {

	/**
	 * @param args
	 */
	//burası çalıştır sınıfı
	public static void main(String[] args) {
		hayvan h=new omurgali();//upcasting
		canli c=new omurgasiz();//upcasting
		canli c1=new hayvan();//upcasting
		canli c2=(canli) new hayvan();
//		c2.adsoyle();
//		c.adsoyle();
//		c1.adsoyle();
//		h.adsoyle();
		//üstten alttaki metodlara erişebiliyoruz. up cast ediyoruz.(hayvanı canlı tipine çeviriyoruz.)
		
		hayvan h1=new hayvan(); 
		canli cn1=h1; //upcasting
		cn1.adsoyle();
		hayvan h2=(hayvan)cn1;
		h2.adsoyle();
		omurgali o1=new omurgali();
		hayvan h3=o1;//upcasting;
		omurgali o2=(omurgali)h3; //downcasting
		o2.adsoyle();
		
	}

}
