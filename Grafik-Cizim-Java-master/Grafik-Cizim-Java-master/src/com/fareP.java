package com;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Float;

import javax.swing.JPanel;

public class fareP extends JPanel implements MouseListener,MouseMotionListener {
	int x0,x1,y0,y1;
	Color c;
	boolean first;
	Line2D x;
	public fareP(){
		super();
		x0=0;y0=0;x1=0;y1=0;
		c=new Color(200, 45, 60);
		first=true;
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public fareP(int x0,int y0,int x1,int y1){
		super();
		this.x0=x0;this.y0=y0;this.x1=x1;this.y1=y1;
		c=new Color(200, 45, 60);
		first=true;
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void setLine(int x0i,int y0i,int x1i,int y1i) {
		x0=x0i;y0=y0i;x1=x1i;y1=y1i;
	}
	public void paint(Graphics arg0) {
		super.paint(arg0);
		Graphics2D g=(Graphics2D) arg0;
		g.setFont(new Font(getFont().toString(), Font.BOLD, 18));
		g.setColor(Color.white);
		g.setStroke(new BasicStroke(5.0f));
		x=new Float(x0,y0,x1,y1);
		g.draw(x);
	}
	public void mouseDragged(MouseEvent arg0) {
		
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		x0=arg0.getX();y0=arg0.getY();
	}

	public void mouseReleased(MouseEvent arg0) {
		x1=arg0.getX();y1=arg0.getY();repaint();
	}

}
