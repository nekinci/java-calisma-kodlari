package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.QuadCurve2D;

import javax.swing.JPanel;

public class ikinciDereceEgriP extends JPanel {
	
	public int x[];
	public int y[];
	public int xmax,xmin,ymax,ymin;
	public ikinciDereceEgriP(int xi[],int yi[]){
		int n=xi.length;
		x=new int[n];
		y=new int[n];
		for(int i=0;i<n;i++){
			x[i]=xi[i];y[i]=yi[i];
		}
	}
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		Graphics2D g=(Graphics2D) arg0;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Dimension d=getSize();
		int dx=d.width;
		int dy=d.height;
		g.setPaint(Color.BLACK);
		int n=x.length;
		int m=(n-1)/2;
		for(int i=0;i<n-1;i+=2){
			QuadCurve2D qc2=new QuadCurve2D.Double(x[i], y[i], x[i+1], y[i+1], x[i+2], y[i+2]);
			g.draw(qc2);
		}
	}
}
