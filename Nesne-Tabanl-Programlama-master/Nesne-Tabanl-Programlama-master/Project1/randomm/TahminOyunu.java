package Project1.randomm;

import java.util.Random;

import javax.swing.JOptionPane;

public class TahminOyunu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int nmbr=r.nextInt(10);
		int nmbr1;
		int deger=1;
		while(true)
		{
			String input1=JOptionPane.showInputDialog("Tahmininizi Girin: ");
			nmbr1=Integer.parseInt(input1);
			if(nmbr1==nmbr)
				JOptionPane.showMessageDialog(null, deger+"ncı tahminde bildiniz.");
			else
				deger++;
		}
	}

}
