package com.org.kalitim;

class Urun{
	protected String urunAdi;
	protected int fiyat;
	public Urun(String urunAdi,int fiyat){
		this.urunAdi=urunAdi;
		this.fiyat=fiyat;
	}
	public int sonuc,oran;
	public int KDV(){
		oran=9;
		sonuc=fiyat+fiyat*oran/100;
		return sonuc;
	}
	@Override
	public String toString(){
		return "Urun";
	}
}
class Teknoloji extends Urun{
	protected String marka,model;
	public Teknoloji(String urunAdi,int fiyat,String marka,String model){
		super(urunAdi,fiyat);
		this.marka=marka;
		this.model=model;
	}
	public int KDV(){
		oran=18;
		sonuc=fiyat+fiyat*oran/100;
		return sonuc;
	}
	@Override
	public String toString(){
		return "Teknoloji";
	}
}
class Gida extends Urun{
	protected String tur;
	protected int gramaj;
	public Gida(String urunAdi,int fiyat,String tur,int gramaj){
		super(urunAdi,fiyat);
		this.tur=tur;
		this.gramaj=gramaj;
	}
	public int KDV(){
		oran=21;
		sonuc=fiyat+fiyat*oran/100;
		return sonuc;
	}
	@Override
	public String toString(){
		return "Gıda";
	}
}
class Tekstil extends Urun{
	protected String tur,beden;
	public Tekstil(String urunAdi,int fiyat,String tur,String beden){
		super(urunAdi,fiyat);
		this.tur=tur;
		this.beden=beden;
	}
	public int KDV(){
		oran=15;
		sonuc=fiyat+fiyat*oran/100;
		return sonuc;
	}
	@Override
	public String toString(){
		return "Tekstil";
	}
	
}
public class bolumSonuCanavari {
	public static void main(String[] args){
		Teknoloji AkilliTelefon=new Teknoloji("Telefon", 1611, "Sony", "Xperia Z3+");
		System.out.println("Sınıf adı: "+AkilliTelefon);
		System.out.println("Ürün adı: "+AkilliTelefon.urunAdi);
		System.out.println("Ürün Fiyatı(KDV): "+AkilliTelefon.KDV());
		System.out.println("Ürün Markası: "+AkilliTelefon.marka);
		System.out.println("Ürün Modeli: "+AkilliTelefon.model);

	}
}
