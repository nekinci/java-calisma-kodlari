package com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GrafikP extends JPanel {
	public GrafikP(){
		BufferedImage img=new BufferedImage(500, 600, BufferedImage.TYPE_INT_ARGB);
		Image a=getToolkit().getImage("res/1.png");
		Graphics g=img.getGraphics();
		
	}
}
