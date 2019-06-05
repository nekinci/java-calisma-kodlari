package com;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class cizgiP extends JPanel {
	
	public cizgiP(){
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setFont(new Font(getFont().getFontName(), Font.BOLD, 12));
		this.setBackground(Color.red);
		g2.setColor(Color.white);
		g2.setStroke(new BasicStroke(5.0f));
		Line2D line=new Line2D.Float(50, 50, 600, 600);
		g2.draw(line);
	}
	
}
