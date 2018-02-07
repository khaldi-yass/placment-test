package com.sqli.lhcenZbair.ProjetIniciation;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String sNumber = reader.nextLine();

		reader.close();
		StringBuilder builder = new StringBuilder(sNumber);
		String reversedSNumber = builder.reverse().toString();

		if (sNumber.equals(reversedSNumber))
			System.out.println(true);
		else
			System.out.println(false);
		
		

	}

}
