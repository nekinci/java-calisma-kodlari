package com.org.eventler;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Odev extends JFrame implements MouseListener,MouseMotionListener {
	//ana metod
	JLabel etiket=new JLabel("Sonuç: ");
	String metin="";
	private int x=0,y=0;
	public static void main(String[] args) {
		Runnable r=new Runnable() {
			@Override
			public void run() {
				try {
					Odev init=new Odev();
					init.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};// çalıştırma dosyası ekledik.
		EventQueue.invokeLater(r);
	}
	public Odev(){
		super("Hesap makinesi");
		add(etiket);
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(500, 150);
		String s=JOptionPane.showInputDialog("Giriş");
		String s1=JOptionPane.showInputDialog("Giriş");
		x=Integer.parseInt(s);y=Integer.parseInt(s1);
	}
	@Override
	public void mouseMoved(MouseEvent me){
		int bolum=x+y;
		etiket.setText("Toplam: "+bolum);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int carpim=x*y;
		etiket.setText("Çarpım: "+carpim);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int cikarma=x-y;
		etiket.setText("Çıkarma: "+cikarma);
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int toplam=x+y;
		etiket.setText("Toplam: "+toplam);
	}
	

}
