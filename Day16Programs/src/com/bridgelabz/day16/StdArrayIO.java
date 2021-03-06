package com.bridgelabz.day16;

import java.util.Scanner;

public class StdArrayIO 
{
	public static void main(String[] args) {
		Uitility<Object> func = new Uitility<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input total row : ");
		int row = sc.nextInt();
		System.out.print("Input total column : ");
		int column = sc.nextInt();
		System.out.println("1:Integer Array\n" + "2:Double Array\n" + "3:Boolean Array");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Integer[][] arr1 = Uitility.arrayInt(row, column);
			func.display(arr1,row,column);
			break;
		case 2:
			Double[][] arr2 = func.arrayDouble(row, column);
			func.display(arr2,row,column);
			break;
		case 3:
			Boolean[][] arr3 = Uitility.arrayBoolean(row, column);
			func.display(arr3,row,column);
			break;
		default:
			System.out.println("Please select any option between 1, 2 and 3");
			break;
		}
		sc.close();
	}

}
