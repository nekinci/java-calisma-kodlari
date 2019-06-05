package com.org.dahilisiniflar;

import com.org.dahilisiniflar.Anasinif.DS1.DS2.DS3;

public class Anasinif {
	static class DS1{
		static class DS2{
			static class DS3{
				static void yazdir(){
					System.out.println("DS3 methodu");
				}
			}
		}
	}
	public static void main(String[] args){
	DS3.yazdir();
	}
}
