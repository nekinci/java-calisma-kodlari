package com;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class dikdortgenP extends JPanel {
	
	public void paint(Graphics arg0) {
		super.paint(arg0);
		Graphics2D g=(Graphics2D) arg0;
		this.setBackground(Color.red);
		Rectangle2D rect=new Rectangle2D.Double(50, 50, 50, 50);
		g.setColor(Color.WHITE);
		g.setStroke(new BasicStroke(5.0f));
		g.draw(rect);
		Rectangle2D rect1=new Rectangle2D.Double(100, 100, 50, 50);
		g.draw(rect1);
		Rectangle2D rect2=new Rectangle2D.Double(150, 150, 50, 50);
		g.draw(rect2);
		Rectangle2D rect3=new Rectangle2D.Double(100, 150, 50, 50);
		g.draw(rect3);
		Rectangle2D rect4=new Rectangle2D.Double(50, 150, 50, 50);
		g.draw(rect4);
		Rectangle2D rect5=new Rectangle2D.Double(48, 100, 50, 50);
		g.fill(rect5);
	}
}
