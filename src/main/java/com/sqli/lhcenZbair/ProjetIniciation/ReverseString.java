package com.sqli.lhcenZbair.ProjetIniciation;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String string = reader.nextLine();

		reader.close();

		char[] charArr = string.toCharArray();
		int length = charArr.length;
		
		char c;

		System.out.println(Arrays.toString(charArr));
		
		for (int i = 0; i < length / 2; i++) {
			c = charArr[i];
			charArr[i] = charArr[length - 1 - i];
			charArr[length - 1 - i] = c;
		}

		System.out.println(Arrays.toString(charArr));
	}
}
