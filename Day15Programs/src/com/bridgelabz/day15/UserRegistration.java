package com.bridgelabz.day15;

import java.util.Scanner;
import java.util.regex.Pattern;



public class UserRegistration 
{
	Scanner scanner = new Scanner(System.in);
	public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";
	public static final String EMAILPATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";
	public static final String NUMBERPATTERN = "^[+0-9]{2}[0-9]{10,}$";
	public static final String IDPATTERN = "[A-Za-z0-9]{8,}";
	public static final String PASSWORDPATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
	public static void main(String[] args)
	{
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.readInput();
		
	}
	private void readInput()
	{
		System.out.println("Enter the First Name");
		String firstName = scanner.next();
		validateInput(NAMEPATTERN, firstName);
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		validateInput(NAMEPATTERN, lastName);
		System.out.println("Enter the Email ID");
		String emailID = scanner.next();
		validateInput(EMAILPATTERN, emailID);
		System.out.println("Enter Phone Number");
		String phoneNumber = scanner.next();
		validateInput(NUMBERPATTERN, phoneNumber);
		System.out.println("Enter The UserID");
		String userID = scanner.next();
		validateInput(IDPATTERN, userID);
		System.out.println("Enter the Password");
		String password = scanner.next();
		validateInput(PASSWORDPATTERN, password);
		
	}
	private void validateInput(String pattern, String input)
	{
		if(Pattern.matches(pattern, input))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
