package com;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class elipsP extends JPanel {
	public elipsP(){
		
	}
	public void paint(Graphics arg0) {
		super.paint(arg0);
		Graphics2D g=(Graphics2D)arg0;
		g.setColor(Color.BLUE);
		setBackground(Color.WHITE);
		g.setStroke(new BasicStroke(5.2f));
		Ellipse2D elips=new Ellipse2D.Double(50, 50, 500, 250);
		g.draw(elips);
	}
}
