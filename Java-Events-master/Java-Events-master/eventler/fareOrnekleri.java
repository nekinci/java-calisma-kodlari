package com.org.eventler;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class fareOrnekleri extends JFrame implements MouseListener,MouseMotionListener {
	JLabel etiket1=new JLabel("Etiket1");
	JLabel etiket2=new JLabel("Etiket2");
	
	//ana metod
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					fareOrnekleri init=new fareOrnekleri();
					init.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//bileşenlerimizi yapılandıran constructor
	public fareOrnekleri(){
		super("Fare Olayları");
		Container con=getContentPane();
		setLayout(new GridLayout());
		con.add(etiket1);
		con.add(etiket2);
		//bileşenleri ekledik.
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(570, 100);
	}
	@Override
	public void mouseDragged(MouseEvent me){
		etiket1.setText("Fare sürüklendi");
	}
	@Override
	public void mouseMoved(MouseEvent me){
		etiket1.setText("Farenin yeri değişti");
		int x=me.getX(),y=getY();
		etiket2.setText("Farenin koordinatları=> X: "+x+" Y: "+y);
	}
	@Override
	public void mouseClicked(MouseEvent me){
		etiket1.setText("Fare tıklandı");
	}
	@Override
	public void mouseEntered(MouseEvent me){
		etiket1.setText("Etki alanına girdi");
	}
	@Override
	public void mouseExited(MouseEvent me){
		etiket1.setText("Etki alanından çıktı");
	}
	@Override
	public void mousePressed(MouseEvent me){
		etiket1.setText("Fareye basıldı");
	}
	@Override
	public void mouseReleased(MouseEvent me){
		etiket1.setText("Fare bırakıldı.");
	}
}
