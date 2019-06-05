package com.org.iletisim;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageFilter;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
public class Userlist extends JLabel implements ListCellRenderer<Object>{
	JLabel usr_name;
	JLabel end_message;
	ImagePanel imagePanel=new ImagePanel();
	public Userlist(String id) throws IOException, PropertyVetoException, FontFormatException{
		super();
		setBounds(0, 0, 450, 100);
		setLayout(null);
		setBackground(Color.CYAN.brighter());
		usr_name=new JLabel("Niyazi");
		usr_name.setLayout(null);
		usr_name.setFont(new Font("Ubuntu", Font.BOLD,20));
		usr_name.setBackground(Color.BLUE.brighter());
		usr_name.setBounds(120, -12, 70, 70);
		end_message=new JLabel("Son mesaj: sağol teşekkür ederim bende\niyiyim.");
		end_message.setBounds(120, 12, 300, 70);
		add(end_message);
		add(usr_name);
		imagePanel.setBounds(10, 10, 90, 80);
		usr_name.setForeground(new Color(50,210,95));
		add(imagePanel);
		JSeparator s=new JSeparator(SwingConstants.HORIZONTAL);
		s.setBounds(0, 94, 450, 5);
		s.setBackground(Color.GRAY.darker());
		add(s);
	}
	
	public static void main(String[] args) {
		
	}
	public Component getListCellRendererComponent(JList<? extends Object> list,
			Object value, int index, boolean isSelected, boolean cellHasFocus) {

		list.setSelectionBackground(Color.gray);
		list.setSelectionForeground(Color.white);
		if(isSelected){
			setBackground(list.getSelectionBackground());
			setBackground(list.getSelectionForeground());
		}
		else{
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		setEnabled(list.isEnabled());
		setFont(list.getFont());
		setOpaque(true);
		return this;
	}


}
