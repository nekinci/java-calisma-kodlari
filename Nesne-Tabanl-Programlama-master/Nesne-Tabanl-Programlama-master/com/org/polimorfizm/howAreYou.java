package com.org.polimorfizm;

class Araba{
	String model;
	int hiz;
	int anlikHiz;
	int vites;
	int depoDurumu;
	public void bilgiVer(int hiz,int anlikHiz,int vites,int depoDurumu){
		this.hiz=hiz;
		this.anlikHiz=anlikHiz;
		this.vites=vites;
		this.depoDurumu=depoDurumu;
	}
	public void gazaBas(){
		anlikHiz+=10;
		System.out.println("Anlık hızınız: "+anlikHiz);
	}
	public void freneBas(){
		anlikHiz-=10;
		System.out.println("Anlık hızınız: "+anlikHiz);
	}
	public void yakitAl(int litre){
		depoDurumu+=litre;
		System.out.println("Yakıt durumunuz :"+depoDurumu);
	}
	public final void modelBelirle(String model){
		this.model=model;
		System.out.println("Araba modeli: "+model);
	}
	
}
class benzinliAraba extends Araba{
	@Override
	public void gazaBas(){
		anlikHiz+=20;
		System.out.println("Anlık hızınız: "+anlikHiz);
	}
	@Override
	public void freneBas(){
		anlikHiz-=20;
		System.out.println("Anlık hızınınz :"+anlikHiz);
	}
	@Override
	public void yakitAl(int litre){
		depoDurumu+=(litre-5);
	}
	@Override
	public void bilgiVer(int hiz,int anlikHiz,int vites,int depoDurumu){
		this.hiz=hiz;
		this.anlikHiz=anlikHiz;
		this.vites=vites;
		this.depoDurumu=depoDurumu;
	}
	
}
class gazliAraba extends Araba{
	@Override
	public void gazaBas(){
		anlikHiz+=8;
		System.out.println("Anlık hızınız: "+anlikHiz);
	}
	@Override
	public void freneBas(){
		anlikHiz-=8;
		System.out.println("Anlık hızınınz :"+anlikHiz);
	}
	@Override
	public void yakitAl(int litre){
		depoDurumu+=(litre+10);
	}
	@Override
	public void bilgiVer(int hiz,int anlikHiz,int vites,int depoDurumu){
		this.hiz=hiz;
		this.anlikHiz=anlikHiz;
		this.vites=vites;
		this.depoDurumu=depoDurumu;
	}
	
}

public class howAreYou {

	public static void setObject(Araba audi){
		audi.bilgiVer(240,40,5,60);
		audi.gazaBas();
		audi.freneBas();
		audi.yakitAl(5);
		audi.modelBelirle("A4");
	}
	public static void main(String[] args) {
		Araba a1=new Araba();
		benzinliAraba a2=new benzinliAraba();
		gazliAraba a3=new gazliAraba();
		setObject(a1);
		setObject(a2);
		setObject(a3);
		System.out.println(a1.getClass().equals(Araba.class));
		
	}

}
