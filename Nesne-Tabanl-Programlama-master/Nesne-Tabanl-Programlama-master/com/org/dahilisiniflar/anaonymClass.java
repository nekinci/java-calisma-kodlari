package com.org.dahilisiniflar;

interface Faktoriyel{
	public double hesap();
}
public class anaonymClass {
	
	public Faktoriyel faktoriyelAl(final double sayi){
		return new Faktoriyel() {
			//Arayüz içerisinde metodları kullanmak için isimsiz(anonymous) bir sınıf oluşturduk.
			@Override //metodu override ediyoruz.	
			public double hesap() {
				double x=1;
				for(int i=1;i<=sayi;i++){
					x*=i;
				}
				return x;
			}
		}; //noktalı virgül kullanıldı.
	}
	public static void main(String[] args) {
		anaonymClass f=new anaonymClass();
		Faktoriyel d=f.faktoriyelAl(5); // faktöriyel(interface) tipinde nesne tanımlıyoruz çünkü sınıfın ismi yok.
		System.out.println("5 in faktöriyeli => "+d.hesap());

	}

}
