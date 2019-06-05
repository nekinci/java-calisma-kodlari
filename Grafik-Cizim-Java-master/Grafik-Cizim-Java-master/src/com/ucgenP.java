package com;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class ucgenP extends JPanel {
	
	public ucgenP(){
		
	}
	public void paint(Graphics arg0) {
		super.paint(arg0);
		Graphics2D g=(Graphics2D)arg0;
/*		int x0=300,x1=150,x2=200;
		GeneralPath ucgen=new GeneralPath();
		ucgen.moveTo(x0, x1);
	//	ucgen.lineTo(x0, x1);
		ucgen.lineTo(x1, x2);
		ucgen.lineTo(x2, x1);
		ucgen.closePath();
		g.setColor(Color.BLUE);
		g.draw(ucgen);*/
		g.setStroke(new BasicStroke(5.0f));
		g.setColor(Color.BLUE);
		Line2D l1=new Line2D.Double(100,75,60,135);
		g.draw(l1);
		Line2D l2=new Line2D.Double(100, 75, 140,135);
		g.draw(l2);
		Line2D l3=new Line2D.Double(58, 138,140,138);
		g.draw(l3);

	}
	
}
