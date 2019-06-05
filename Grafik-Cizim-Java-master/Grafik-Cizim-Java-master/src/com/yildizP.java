package com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class yildizP extends JPanel {
	
	public void paint(Graphics arg0) {
		super.paint(arg0);
		int x[]={55,67,109,73,83,55,27,37,1,43};
		int y[]={0,36,36,54,96,72,96,54,36,36};
		Graphics2D g=(Graphics2D)arg0;
		GeneralPath yildiz=new GeneralPath();
		yildiz.moveTo(x[0], y[0]);
		for(int i=1;i<x.length;i++){
			yildiz.lineTo(x[i], y[i]);
		}
		yildiz.closePath();
		g.setColor(Color.DARK_GRAY);
		g.draw(yildiz);
	}
}
