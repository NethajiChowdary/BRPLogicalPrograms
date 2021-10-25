package com.bridgelabz.day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeAnagram
{

	public static void main(String[] args) 
	{
		List<List<Integer>> totalprime = new ArrayList<List<Integer>>();
		List<Integer> primenumbers = new ArrayList<Integer>();
		Set<Integer> PrimeAnagram = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Prime Numbers between 0 to 1000 are: ");
		primenumbers = DataStructure.primeNumbers(0, 1000);
		System.out.println(primenumbers);
		PrimeAnagram = DataStructure.primeAnagram(primenumbers);
		System.out.println("The size of Prime Number which are Anagram is " + PrimeAnagram.size() + " and the numbers are: ");
		System.out.println(PrimeAnagram);
		list.addAll(PrimeAnagram);
		for(int j = 0; j < list.size(); j++)
		{
			if(primenumbers.contains(list.get(j)))
			{
				primenumbers.remove(list.get(j));
			}
		}
		System.out.println("Total Prime Numbers which are not anagram is " +primenumbers.size() + " and the numbers are: ");
		System.out.print(primenumbers);
		totalprime.add(primenumbers);
	}

}
