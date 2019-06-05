package com.org.eventler;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
public class Event_21_7 extends JFrame implements MouseListener, MouseMotionListener {

	private JPanel contentPane;
	private JTextField txtVariableOne;
	private JTextField txtVariableTwo;
	private JLabel lblSum;
	private JLabel lblSub;
	private JLabel lblDiv;
	private JLabel lblMultiply;
	private JLabel lblMouseEvent;
	private JLabel lblLastEvent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event_21_7 frame = new Event_21_7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Event_21_7() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVariableOne = new JLabel("Birinci Say\u0131");
		lblVariableOne.setBounds(10, 25, 64, 14);
		contentPane.add(lblVariableOne);
		
		txtVariableOne = new JTextField();
		txtVariableOne.setText("0");
		txtVariableOne.setBounds(84, 22, 86, 20);
		contentPane.add(txtVariableOne);
		txtVariableOne.setColumns(10);
		
		JLabel lblVariableTwo = new JLabel("\u0130kinci Say\u0131");
		lblVariableTwo.setBounds(180, 25, 57, 14);
		contentPane.add(lblVariableTwo);
		
		txtVariableTwo = new JTextField();
		txtVariableTwo.setText("0");
		txtVariableTwo.setBounds(247, 22, 97, 20);
		contentPane.add(txtVariableTwo);
		txtVariableTwo.setColumns(10);
		
		JLabel lblSumInfo = new JLabel("\u0130ki Say\u0131n\u0131n Toplam\u0131");
		lblSumInfo.setBounds(70, 63, 111, 14);
		contentPane.add(lblSumInfo);
		
		JLabel lblSubInfo = new JLabel("\u0130ki Say\u0131n\u0131n Fark\u0131");
		lblSubInfo.setBounds(71, 88, 110, 14);
		contentPane.add(lblSubInfo);
		
		JLabel lblDivInfo = new JLabel("\u0130ki Say\u0131n\u0131n B\u00F6l\u00FCm\u00FC");
		lblDivInfo.setBounds(71, 113, 110, 14);
		contentPane.add(lblDivInfo);
		
		JLabel lblMultiplyInfo = new JLabel("\u0130ki Say\u0131n\u0131n \u00C7arp\u0131m\u0131");
		lblMultiplyInfo.setBounds(70, 138, 111, 14);
		contentPane.add(lblMultiplyInfo);
		
		lblSum = new JLabel("");
		lblSum.setBounds(191, 63, 46, 14);
		contentPane.add(lblSum);
		
		lblSub = new JLabel("");
		lblSub.setBounds(191, 88, 46, 14);
		contentPane.add(lblSub);
		
		lblDiv = new JLabel("");
		lblDiv.setBounds(191, 113, 46, 14);
		contentPane.add(lblDiv);
		
		lblMultiply = new JLabel("");
		lblMultiply.setBounds(191, 138, 46, 14);
		contentPane.add(lblMultiply);
		
		lblMouseEvent = new JLabel("Son Ger\u00E7ekle\u015Fen Fare Olay\u0131");
		lblMouseEvent.setBounds(10, 188, 160, 14);
		contentPane.add(lblMouseEvent);
		
		lblLastEvent = new JLabel("");
		lblLastEvent.setBounds(191, 188, 153, 14);
		contentPane.add(lblLastEvent);
		
		//Fare Listener'leri eklendi
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		lblSub.setText(String.valueOf(Double.valueOf(txtVariableOne.getText()) - 
				Double.valueOf(txtVariableTwo.getText())));
		lblLastEvent.setText("Fare tıklandı");
	}
	

	@Override
	public void mouseEntered(MouseEvent e) { }
	

	@Override
	public void mouseExited(MouseEvent e) { }
	

	@Override
	public void mousePressed(MouseEvent e) { }
	

	@Override
	public void mouseReleased(MouseEvent e) {
		lblSum.setText(String.valueOf(Double.valueOf(txtVariableOne.getText()) + 
				Double.valueOf(txtVariableTwo.getText())));
		lblLastEvent.setText("Fare tuşu serbest bırakıldı");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		lblMultiply.setText(String.valueOf(Double.valueOf(txtVariableOne.getText()) * 
				Double.valueOf(txtVariableTwo.getText())));
		lblLastEvent.setText("Fare sürüklendi");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lblDiv.setText(String.valueOf(Double.valueOf(txtVariableOne.getText()) / 
				Double.valueOf(txtVariableTwo.getText())));
		lblLastEvent.setText("Fare hareket ettirildi");
	}
}