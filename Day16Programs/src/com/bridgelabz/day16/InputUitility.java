package com.bridgelabz.day16;

import java.util.Scanner;

public class InputUitility 
{
	private InputUitility() {
		
	}
	private static  Scanner scanner = new Scanner(System.in);
	public static int inputInteger() {
		return scanner.nextInt();
	}
	public static long inputLong() {
		return scanner.nextLong();
	}
	public static boolean checkNext() {
		return scanner.hasNext();
	}
	public static double inputDouble() {
		return scanner.nextDouble();
	}
	public static float inputFloat() {
		return scanner.nextFloat();
	}
	public static String inputString() {
		return scanner.next();
	}
	public static String inputStringLine() {
		return scanner.nextLine();
	}
}
