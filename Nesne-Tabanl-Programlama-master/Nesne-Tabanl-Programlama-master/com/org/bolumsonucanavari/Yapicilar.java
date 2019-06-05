package com.org.bolumsonucanavari;

class yapiciSinifi{
	int x;
	String y;
	public yapiciSinifi(String y){
		this(5,y);
	}
	public yapiciSinifi(int x,String y){
		System.out.println(x+" "+y);
	}
}
//Bir sınıf içinde 2 tane yapıcı oluşturun.Yapıcılardan biri string tipinde parametre
//ikincisi hem string hem int tipinde parametre alsın.
//bu sınıfta bir nesne oluşturun ve yapıcıya string gönderin.
//yapıcı this anahtar kelimesiyle  int ekleyerek diğer yapıcıya gitsin ve bu yapıcıda ekrana bassın.
public class Yapicilar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yapiciSinifi d=new yapiciSinifi("Niyazi");

	}

}
