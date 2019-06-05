package com.org.kalitim;

class sinif1{
	int x,y;
	void deger_ata(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class sinif2 extends sinif1{
	
	int carp()
	{
		return x*y;
	}
}
public class Calistir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sinif2 nesne=new sinif2();
		nesne.deger_ata(5, 3);
		System.out.println(nesne.carp());
	}

}
//kalıtım yapılan sınıftan süper-class sınıfın private değişkenlerine ve metodlarına erişilemez.