package com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ellipseP2 extends JPanel {
	TexturePaint tp=getImageTexture("/home/nekinci/Masaüstü/1.jpg");
	public ellipseP2(){
		
	}
	public TexturePaint getImageTexture(String imagePath){
		Image img=getToolkit().getImage(imagePath);
		try{
			MediaTracker tracker = new MediaTracker(this);
			tracker.addImage(img, 0);
			tracker.waitForID(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		int width=img.getWidth(this);
		int height=img.getHeight(this);
		BufferedImage buffImg=new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics g=buffImg.getGraphics();
		g.drawImage(img, 0, 0, this);
		Rectangle2D rc=new Rectangle(0,0,width,height);
		return new TexturePaint(buffImg, rc);
		
	}
	public void paint(Graphics arg0) {
		super.paint(arg0);
		Graphics2D g=(Graphics2D)arg0;
		g.setPaint(tp);
		Ellipse2D elipse=new Ellipse2D.Double(50, 50, 300, 300);
		g.fill(elipse);
		
	}
}
