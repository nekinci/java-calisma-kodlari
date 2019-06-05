package com;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class Mesajci extends User {

	
	@Override
	public void mesajGonder(String kime, String mesaj) {
		System.out.println("Mesaj ana bilgisayara gönderiliyor...");
		srv.mesajGonder(isim, kime, mesaj);
		txtMesaj+="\n["+isim+"] : "+mesaj;
		txtArea.setText(txtMesaj);
	}

	@Override
	public boolean mesajAlici(String kimden, String mesaj) {
		System.out.println("Mesaj "+ kimden + " kişisinden alındı.");
		txtMesaj+="\n["+kimden+"] : "+mesaj;
		txtArea.setText(txtMesaj);
		return true;
	}
	
	//Constructors
	
	public Mesajci(Server srv, String isim) {
		super(srv, isim);
		setSize(350,350);
		setVisible(true);
		initParams();
		setLayout(new FlowLayout());
		add(txtArea);
		add(btnMesaj);
	}
	
	//Methods
	
	private void initParams() {
		//Parameter initilization..
		txtArea=new JTextArea();
		btnMesaj=new JButton("Gönder");
		
		btnMesaj.setBackground(Color.decode("#636363"));
		txtArea.setBackground(Color.CYAN);
	}
	
	//Fields 
	JTextArea txtArea;
	JButton btnMesaj;
	String txtMesaj="Mesajlaşma";
}
