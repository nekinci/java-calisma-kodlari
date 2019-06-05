package com;

import javax.swing.JFrame;

public abstract class User extends JFrame{
	
	public abstract void mesajGonder(String kime,String mesaj);
	public abstract boolean mesajAlici(String kimden,String mesaj);
	
	
	//Constructors
	public User(Server srv,String isim) {
		this.srv=srv;this.isim=isim;
		srv.katilimciEkle(this, isim); //Katılımcı anabilgisayara eklendi.
	}
	
	//Getter-Setter Methods
	public Server getSrv() {
		return srv;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void setSrv(Server srv) {
		this.srv = srv;
	}
	
	//Fields
	
	protected Server srv;
	protected String isim;
	
}
