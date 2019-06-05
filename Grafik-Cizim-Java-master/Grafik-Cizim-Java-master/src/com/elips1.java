package com;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JPanel;

public class elips1 extends JPanel{
	public elips1(){
		
	}
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		Graphics2D g=(Graphics2D)arg0;
		g.setColor(new Color(200, 100, 50));
		g.setStroke(new BasicStroke(4.0f));
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		float dash3[]={10.0f,3.0f,3.0f};
		BasicStroke d3=new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 3.0f, dash3, 2.0f);
		g.setStroke(d3);
		Ellipse2D elipse1=new Double(50,50,500,500);
		g.draw(elipse1);
	}
}
