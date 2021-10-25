package com.bridgelabz.day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataStructure 
{
	public static ArrayList<Integer> primeNumbers(int m,int n) {
		ArrayList<Integer> lst=new ArrayList<Integer>();
		int temp;

		if(m>n) {
			temp=m;
			m=n;
			n=temp;}
		int flag=1;
		
		for(int i=m;i<=n;i++){
			for(int j=2;j<i;j++){
				
				if(i%j==0){
					flag=0;
					break;}
				else
					flag=1;}
			
			if(flag==1)
				lst.add(i);}
		return lst;
		}
	public static boolean isAnagram(String word, String anagram) {
		boolean isAnagram = false;

		if (word != null && anagram != null && word.length() == anagram.length()) {
			char[] arr = word.toCharArray();
			StringBuilder temp = new StringBuilder(anagram);
			for (char ch : arr) {
				int index = temp.indexOf("" + ch);
				if (index != -1) {
					temp.deleteCharAt(index);
				}
			}
			isAnagram = temp.toString().isEmpty();
		}
		return isAnagram;
	}
	public static Set<Integer> primeAnagram(java.util.List<Integer> primenumbers) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primenumbers.size(); i++) {
			for (int j = i+1; j < primenumbers.size(); j++) {
				if (isAnagram(String.valueOf(primenumbers.get(i)), String.valueOf(primenumbers.get(j)))) {
					primeAnagram.add(primenumbers.get(i));
					primeAnagram.add(primenumbers.get(j));
				}
			}
		}
		return primeAnagram;
  }
}
