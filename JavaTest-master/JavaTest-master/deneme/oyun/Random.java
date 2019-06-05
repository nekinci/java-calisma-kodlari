package deneme.oyun;

import javax.swing.JOptionPane;

public class Random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		java.util.Random r= new java.util.Random();
		int sayi;
		sayi=r.nextInt(10);
		int i=0;
		while(true)
		{
			String s1 = JOptionPane.showInputDialog("Tahminde bulunun: ");
			int sayi1=Integer.parseInt(s1);
			if(sayi1==sayi)
			{
				JOptionPane.showMessageDialog(null, i+"nci tahminde bildiniz.", "Sonuç",JOptionPane.PLAIN_MESSAGE);
				break;
			}
			else{
				i++;
			}
		}
	}

}
