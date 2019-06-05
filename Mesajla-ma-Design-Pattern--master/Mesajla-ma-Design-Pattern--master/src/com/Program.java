package com;

public class Program {

	public static void main(String[] args) {
		Server s=new Server();
		Mesajci m=new Mesajci(s, "Niyazi");
		Mesajci m1=new Mesajci(s, "Ali");
		
		m.mesajGonder("Ali", "Nasılsın");
	}

}
