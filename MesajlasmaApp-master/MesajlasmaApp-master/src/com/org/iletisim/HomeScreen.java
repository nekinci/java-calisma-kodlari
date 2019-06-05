package com.org.iletisim;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.FontFormatException;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class HomeScreen extends JFrame {
	JTabbedPane pane;
	ArrayList<Userlist> l;
	public HomeScreen() throws IOException, PropertyVetoException, FontFormatException{
		super("Message");
		setSize(550,500);
		setVisible(true);
		setResizable(false);
		Container con=getContentPane();
		pane=new JTabbedPane(JTabbedPane.RIGHT,JTabbedPane.WRAP_TAB_LAYOUT); 
		pane.setBounds(0, 0, 500, 50);
		con.add(pane);
		pane.setBackground(Color.blue);
		l=new ArrayList<Userlist>();
		for(int i=0;i<15;i++)
			l.add(new Userlist(""+i));
		ListModel<Userlist> listModel=new ListModel<Userlist>() {
			
			public void removeListDataListener(ListDataListener arg0) {
				
			}
			
			public int getSize() {
				return l.size();
			}
			
			public Userlist getElementAt(int arg0) {
				return l.get(arg0);
			}
			
			public void addListDataListener(ListDataListener arg0) {
				
			}
		};
		JList<Userlist> liste=new JList<Userlist>(listModel);
		liste.setCellRenderer(new Userlist("1"));
		liste.setFixedCellHeight(100);
		liste.setBackground(Color.cyan.brighter());
		liste.setBounds(0, 0, 450, 400);
		JScrollPane scroll=new JScrollPane(liste);
		pane.addTab("Mesajlar", scroll);
		add(pane);
		this.setLocation(getWidth()-50, getHeight()-250);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					HomeScreen a=new HomeScreen();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (PropertyVetoException e) {
					e.printStackTrace();
				} catch (FontFormatException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
