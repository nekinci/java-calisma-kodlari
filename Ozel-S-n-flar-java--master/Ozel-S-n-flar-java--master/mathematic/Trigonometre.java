package com.org.mathematic;

import java.util.Scanner;

public class Trigonometre {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Lütfen 0-180 arası bir derece girin: ");
			int degrees=s.nextInt();
			if(degrees>=0&&degrees<=180){
				System.out.println("Cosinüs değeri -> "+Math.cos(Math.toRadians(degrees)));
				System.out.println("Sinüs değeri -> "+Math.sin(Math.toRadians(degrees)));
				System.out.println("Tanjant değeri -> "+Math.tan(Math.toRadians(degrees)));
				System.out.println("Cotanjant değeri -> "+Math.tanh(Math.toRadians(degrees)));
				System.out.println("Secant değeri -> "+Math.cosh(Math.toRadians(degrees)));
			}
			else
				System.out.println("0 ile 180 arasında olmalıdır.");

	}	}