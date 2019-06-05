package com.org.kalitim;

class H{
	int x;
}
public class G extends H {
	
	/**
	 * @param args
	 */
	int x;
	public G(int i,int j){
		super.x=i; //H sınıfının x değişkenine atar
		this.x=j; //G sınıfının x değişkenine atar.
		//x=j; buda G sınıfının x değişkenine atar.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G nesne=new G(3,5);
		System.out.println(nesne.x);
	}

}
