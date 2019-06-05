package com.org.eventler;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class baslangic extends JFrame implements KeyListener {
	//implement edildi.
	JLabel etiket=new JLabel("etiket");
	String metin="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(
				new Runnable() {
					
					@Override
					public void run() {
						try{
							baslangic init=new baslangic();
							init.setVisible(true);
						}catch(Exception ex){
							ex.printStackTrace();
						}
					}
				});
	}
	public baslangic(){
		super("Klavye olayları");
		add(etiket);
		addKeyListener(this);
		setSize(550, 100);
	}
	@Override
	public void keyPressed(KeyEvent ke){
		metin+="Klayvyeden bir tuşa basıldı - ";
	}
	@Override
	public void keyTyped(KeyEvent ke){
		char tus=ke.getKeyChar();
		metin+="Klavyeden basılan tuş: "+tus+" - ";
		etiket.setText(metin);
	}
	@Override
	public void keyReleased(KeyEvent ke){
		metin+="Serbest bırakıldı";
		etiket.setText(metin);
	}

}
