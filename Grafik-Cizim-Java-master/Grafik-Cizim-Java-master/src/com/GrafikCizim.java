package com;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrafikCizim extends JFrame {
	JPanel p1;
	public GrafikCizim(String s,JPanel p){
		super(s);
		p1=p;
		add(p);	
	}
	public static void main(String[] args) {
		int x[]={0,100,200,300,400,500,600};
		int y[]={200,0,200,400,200,0,200};
		GrafikCizim gc=new GrafikCizim("Grafik cizim", new yildizP());
		gc.setVisible(true);
		gc.setSize(800, 500);
		gc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
