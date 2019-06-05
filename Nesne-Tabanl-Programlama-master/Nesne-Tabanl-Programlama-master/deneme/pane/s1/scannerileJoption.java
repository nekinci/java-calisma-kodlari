package deneme.pane.s1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class scannerileJoption {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Input the Array Length,please: ");
		int aryLength;
		Scanner s=new Scanner(System.in);
		aryLength=s.nextInt();
		int [] Arry=new int[aryLength];
		int number;
		for(int i=0;i<aryLength;i++)
		{
			String input = JOptionPane.showInputDialog("Input the number,please: ");
			number=Integer.parseInt(input);
			Arry[i]=number;
			JOptionPane.showMessageDialog(null, "Number: "+number,"Result",JOptionPane.DEFAULT_OPTION);
		}
		for(int i:Arry)
			System.out.println(i);
		

	}

}
