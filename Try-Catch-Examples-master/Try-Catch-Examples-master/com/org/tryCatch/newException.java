package com.org.tryCatch;


class benimHatam extends Exception{
	String hataMetni="Özel hata tipi";
	String hataTipi="hataTipim";
	
	public void benimHatam(){}//constructor
	@Override
	public String toString(){
		hataMetni+=String.format(" : "+hataTipi);
		return hataMetni;
	}
	
}
class sinif{
	public void function() throws benimHatam{
		throw new benimHatam();
	}
}
public class newException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sinif s=new sinif();
		try{
			s.function();
		}catch(benimHatam bh){
			System.out.println(bh.toString());
		}
	}

}
