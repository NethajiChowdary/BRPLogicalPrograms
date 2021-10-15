package com.bridgelabz.day16;

import java.io.PrintWriter;
import java.util.Scanner;

public class Uitility <E>
{
	Scanner scanner = new Scanner(System.in);
	public static boolean isLeapYear (int year) {
		boolean leapyear = false;
		if ((year % 4 == 0 && year % 100 != 0 && year % 400 == 0)) {
			leapyear = true;
			return leapyear;
		}
		else {
			leapyear = false;
			return leapyear;
		}
			
	}
	public static Integer[][] arrayInt(int row , int column){
		Integer[][] genericArray = new Integer[row][column];		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i < row; i++) {
			for (int j =0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		return genericArray;
			
	}
	public Double[][] arrayDouble(int row, int column){
		Double[][] genericArray = new Double[row][column];
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i < row; i++) {
			for (int j =0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = scanner.nextDouble();
			}
		}
		scanner.close();
		return genericArray;
	}
	public static Boolean[][] arrayBoolean(int row, int column){
		Scanner scanner = new Scanner(System.in);
		Boolean[][] genericArray  = new Boolean[row][column];
		System.out.println("enter the boolean value:");
		System.out.println("enter the value between 0 and 10");
		for(int i =0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = scanner.nextBoolean();
			}
		}
		scanner.close();
		return genericArray;
	}
	public void display(E[][] genericArray, int row, int column)
	{
		PrintWriter th = new PrintWriter(System.out, true);
		for(int i=0; i < row; i++) {
			for(int j =0; j < column; j++) {
				th.print(genericArray[i][j] + " ");
				th.println();
			}
		}
	}
}
