package com.bridgelabz.day17;

import java.util.ArrayList;
import java.util.List;

public class Prime2D
{
	public static void main(String[] args)
	{
		List<List<Integer>> array = new ArrayList<List<Integer>>();
		int start = 0;
		int end = 1000;
		for(int i =0; i < 1; i++)
		{
			List<Integer> listofPrimeNumbers = DataStructure.primeNumbers(start, end);
			array.add(listofPrimeNumbers);
			start += 1000;
			end += 1000;
		}
		for(int i =0; i < array.size(); i++)
		{
			List<Integer> primeNumbers = array.get(i);
			for(int j = 0; j < primeNumbers.size(); j++)
			{
				System.out.println(primeNumbers.get(j) + " ");
			}
			System.out.println();
		}
	}
}
