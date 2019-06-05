package com;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.net.URL;

import javax.swing.JPanel;

public class resimP extends JPanel {
	private Image resim;
	public resimP(String path){
		super();
		resim=getToolkit().getImage(path);
		System.out.println(resim.getHeight(this));
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		g2.drawImage(resim, 0, 0,this.getWidth(),this.getHeight(), this);
	}
}
