package com.org.Strings;

import javax.swing.JOptionPane;

public class Palindrome {

	/**
	 * @param args
	 */
	public static boolean isPalindrome(String read){
		String newStr="";
		int length=read.length();
		for(int i=length-1;i>=0;i--){
			newStr+=read.charAt(i);
		}
		if(read.equalsIgnoreCase(newStr))
			return true;
		return false;
	}
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null,"","Bir şeyler yazın..");
		int length=input.length();
		char kaynakDizi[]=new char[length];
		String toStringDizisi="";
		kaynakDizi=input.toCharArray();
		for(int i=length-1;i>=0;i--){
			toStringDizisi+=kaynakDizi[i];
		}
//		if(input.equals(toStringDizisi)){
//			System.out.println(input.toUpperCase());
//		}
//		else{
//			System.out.println("Palindorme değil "+input+"!="+toStringDizisi);
//			System.out.println(input.toLowerCase());
//		}
		if(isPalindrome(input))
			System.out.println(input.toUpperCase());
		else{
			System.out.println("Palindorme değil "+input+"!="+toStringDizisi);
			System.out.println(input.toLowerCase());
		}
	}

}
