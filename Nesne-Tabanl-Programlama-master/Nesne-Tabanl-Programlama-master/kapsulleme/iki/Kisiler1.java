package kapsulleme.iki;


public class Kisiler1 {

	protected void KisiSayisi()
	{
		System.out.println("Epey fazla kisi var");
	}
	
	public void Kisiler1(){
		System.out.println("Nesne oluşturuldu."); //kisiler yapıcısıyla nesne oluşturulunca kullanıcıya bilgi verdik.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Siniftan d=new Siniftan();
		System.out.println(d.belge);
		d.kasa();
		AileDisi birey=new AileDisi();
		//birey.metod(); //Erişmeye çalıştığımızda erişemedik.
		//System.out.println(birey.x); //Aynı şekilde bunada.
		Ev anne=new Ev();
		anne.Bilgisayar();
		System.out.println(anne.modem);
		Kisiler1 insan=new Kisiler1();
		insan.KisiSayisi();
	}

}
class Siniftan{
	public Siniftan()
	{
		System.out.println("Nesne başarıyla oluşturuldu.");
	}
	public String belge ="Gizli belge"; //private yapınca erişim hatası veriyor.
	public void kasa(){	//public yapınca hata vermeden diğer classtan sinifimizin nesnelerne ulaşabiliyoruz.
		System.out.println("Gizli kasa");
	}
}
class AileDisi{
	public AileDisi()
	{
		System.out.println("Aile disi bir birey oluşturuldu.Ben bir Constructorum.");
	}
	private String x="Aile disi oldugum için beni dışladılar.";
	private void metod()
	{
		System.out.println("Bana kimse ulaşamayacak!");
	}
}
class Ev{
	public Ev(){
		System.out.println("Evin kapısı açıldı");
	}
	protected void Bilgisayar()
	{
		System.out.println("Bilgisayar açılıyor.");
	}
	protected String modem="Modem açıldı.İnternete bağlanabilirsiniz.";
}