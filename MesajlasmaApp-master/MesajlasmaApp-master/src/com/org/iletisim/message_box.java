package com.org.iletisim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class message_box extends JPanel {
	final static int LEFT_MESSAGE=35;
	final static int RIGHT_MESSAGE=5;
	static int ilkhal=0;
	public message_box(){
		String message1="Bu bir deneme mesajıdır.";
		setLayout(null);
//		setSize(450, 135);
		setBackground(Color.CYAN);
		JLabel label=new JLabel("Niyazi");
		label.setLayout(null);
		label.setBackground(Color.ORANGE);
		JTextArea mesaj=new JTextArea();
		mesaj.setLineWrap(true);
		mesaj.append(message1);
		label.setBounds(10, -5, 140, 35);
		mesaj.setBounds(10, 25, 415, 40);
		//setSize(450, 60);
		//setBounds(0, 10, 450, 60);
		add(label);
		add(mesaj);	
	}
	public message_box setLeft(){
			this.setBounds(LEFT_MESSAGE, ilkhal+=30, 400, 60);
			System.out.println(LEFT_MESSAGE);
			return this;
			
	}
	public message_box setRight(){
		this.setBounds(RIGHT_MESSAGE,ilkhal+=30,400,60);
		return this;
	}
	@Override
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		arg0.setColor(Color.white);
		arg0.fillRoundRect(0, 0, 449, 60, 25, 25);
	}
}
