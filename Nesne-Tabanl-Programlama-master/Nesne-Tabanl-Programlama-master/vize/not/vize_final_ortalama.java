package vize.not;

import javax.swing.JOptionPane;

public class vize_final_ortalama {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("Vize Notunu girin: ");
		int vize=Integer.parseInt(s1);
		while(vize<0||vize>100){
			s1=JOptionPane.showInputDialog("Vize Notunu girin: ");
			vize=Integer.parseInt(s1);
		}
		String s2=JOptionPane.showInputDialog("Final Notunu girin: ");
		int finalNotu=Integer.parseInt(s2);
		while(finalNotu<0||finalNotu>100)
		{
			s2=JOptionPane.showInputDialog("Final Notunu girin: ");
			finalNotu=Integer.parseInt(s2);
		}
		int sonuc=(int) (vize*0.4+finalNotu*0.6);
		JOptionPane.showMessageDialog(null, "Notunuz: "+sonuc);
	}

}
