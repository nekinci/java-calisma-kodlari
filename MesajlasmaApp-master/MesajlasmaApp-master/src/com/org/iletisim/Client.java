package com.org.iletisim;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import org.omg.CosNaming._BindingIteratorImplBase;

public class Client extends JFrame implements ActionListener{
	private String id;
	private static String message;
	private JTextArea message_board;
	private JTextArea message_screen;
	private JButton btn_send;
	private JPanel panel;
	Server server;
	Client c;
	boolean sended=false;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void send_message(Server usr,String message,Client c){
		this.message+="  "+getId() + " :"+message_board.getText()+ "\n";
		message_screen.setText(this.message);
		message_board.setText("");
		//server.setMessage(message);
		//server.setSending_id(id);
		c.message_screen.setText(this.message);
		sended=true;
	}
	public Client(String id) throws IOException, PropertyVetoException, Exception{
		super("Client@"+id);
		this.id=id;
		
		Container con=getContentPane();
		con.setLayout(null);
		setVisible(true);
		setSize(490,500);
		
		panel=new JPanel(null);
		panel.setBounds(0, 0,491,396);
		
		message_board=new JTextArea("Mesajınızı yazın...");
		message_board.setBounds(0, 400, 490, 50);
		message_board.setLayout(null);
		message_board.setLineWrap(true);
		add(message_board);
		
		message_screen=new JTextArea("\t\tKonuşma Günlüğü\n");
		message=message_screen.getText();
		message_screen.setBounds(0, 0, 490, 395);
		message_screen.setBackground(null);
		message_screen.setForeground(null);
		message_screen.setFont(new Font(this.getFont().toString(),Font.BOLD,12));
		message_screen.setFocusable(true);
		message_screen.setLineWrap(true);
		message_screen.setEditable(false);
		message_screen.setLayout(null);
		
		btn_send=new JButton("Gönder");
		btn_send.setBounds(405, 0, 89, 50);
		btn_send.setBackground(Color.LIGHT_GRAY);
		
		panel.add(message_screen);
		con.add(message_screen);
		message_board.add(btn_send);
				
		btn_send.addActionListener(this);
		
		message_screen.setText(message);
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Client c1=new Client("Niyazi");
					Client c2=new Client("Deneme");
					c1.c=c2;
					c2.c=c1;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void actionPerformed(ActionEvent arg0) {
		send_message(server,message,c);
	}
	
}
