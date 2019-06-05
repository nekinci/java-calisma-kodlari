package com;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.text.DateFormatter;

public class Server extends JFrame {
	
	//Constructors
	public Server() {
		setSize(600,600);
		setVisible(true);
		area=new JTextArea();
		add(area);
	}
	
	//Methods
	
	public void mesajGonder(String kimden,String kime, String mesaj) {
		if(!katilimcilar.containsKey(kime)) {
			System.out.println("Böyle birisi yok");
			return;
		}
		txtServer+="\nMesaj ana bilgisayardan ["+kime+"] kişisine gönderiliyor.."
				+ "["+LocalTime.now().toString().substring(0, 8)+"] Mesaj: "+mesaj;
		area.setText(txtServer);
		if(katilimcilar.get(kime).mesajAlici(kimden, mesaj))
			txtServer+="\nMesaj ["+kime+"] kişisi tarafından alındı.";
		area.setText(txtServer);
		
	}
	
	//Getter-Setter Methods
	
	public HashMap<String, User> katilimciAl() {
		return katilimcilar;
	}

	public void katilimciEkle(User u,String isim) {
		katilimcilar.put(isim, u);
		
		txtServer+="\n ["+isim+"] bağlandı. "+LocalTime.now();
		area.setText(txtServer);
	}

	//Fields
	private HashMap<String, User> katilimcilar = new HashMap<>();
	private JTextArea area;
	String txtServer="";
}
