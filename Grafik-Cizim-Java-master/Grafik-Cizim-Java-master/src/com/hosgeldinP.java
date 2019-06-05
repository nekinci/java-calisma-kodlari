package com;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class hosgeldinP extends JPanel {
	String isim;
	public hosgeldinP(){
		isim=JOptionPane.showInputDialog("İsminizi girin: ");
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setFont(new Font("Ubuntu",Font.BOLD,24));
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//pürüzleri giderir
		g2.drawString("Hosgeldiniz : "+isim, 50, 50);
		
		
	}

}
