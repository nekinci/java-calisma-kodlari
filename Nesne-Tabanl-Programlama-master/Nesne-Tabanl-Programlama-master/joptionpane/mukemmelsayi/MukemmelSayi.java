package joptionpane.mukemmelsayi;

import javax.swing.JOptionPane;

public class MukemmelSayi {

	
	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("Input the number,please: ");
		int n1=Integer.parseInt(s1);
		String s2=JOptionPane.showInputDialog("Input the number,please. ");
		int n2=Integer.parseInt(s2);
		perfect_number(n1, n2);
	}
	public static void perfect_number(int n,int n2)
	{
		int result=0,result1=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				result+=i;
			}
		}
		if(result==n)
			JOptionPane.showMessageDialog(null, "Mukemmel Sayi"+n);
		for(int i=1;i<n2;i++)
		{
			if(n2%i==0)
			{
				result1+=i;
			}
		}if(result1==n2)
			JOptionPane.showMessageDialog(null, "Mukemmel Sayi"+n2);
	}

}
