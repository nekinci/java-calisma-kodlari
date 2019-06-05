package sinif.nesne;

public class Yapicilar {

	/**
	 * @param args
	 */
	static int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yapicilar nesne=new Yapicilar();
		nesne.x=50;
		System.out.println(nesne.x);
		x=20;
		System.out.println(x);
		System.out.println(nesne.x);
	}

}
