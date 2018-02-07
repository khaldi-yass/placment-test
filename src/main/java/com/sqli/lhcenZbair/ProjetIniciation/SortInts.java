package com.sqli.lhcenZbair.ProjetIniciation;

import java.util.Arrays;
import java.util.Scanner;

public class SortInts {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = reader.nextInt();

		int[] arrayInt = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter int: ");
			arrayInt[i] = reader.nextInt();
		}

		reader.close();
		System.out.println(Arrays.toString(arrayInt));
		System.out.println(Arrays.toString(sort(arrayInt)));;

	}

	public static int[] sort(int[] array) {

		int c;
		int idx;

		for (int i = 0; i < array.length; i++) {

			int min = array[i];
			idx = i;

			for (int j = i; j < array.length; j++) {

				if (array[j] < min) {
					c = min;
					min = array[j];
					array[j] = c;
					idx = j;
				}
			}

			c = array[i];
			array[i] = min;
			array[idx] = c;

		}
		
		return array;
	}
	
}
