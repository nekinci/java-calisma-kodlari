package com.org.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	/**
	 * @param args
	 */
	public static boolean isAnagram(String str1,String str2){
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char [] aryOne=str1.toCharArray();
		char [] aryTwo=str2.toCharArray();
		Arrays.sort(aryOne);
		Arrays.sort(aryTwo);
		String s1=new String(aryOne);
		String s2=new String(aryTwo);
		return s1.equals(s2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isAnagram("kuyulu","uykulu")==true)
			System.out.println("Anagram");
		else
			System.out.println("Anagram değil");
	}

}
