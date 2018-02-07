package com.sqli.lhcenZbair.ProjetIniciation;

import java.util.Scanner;

public class TriangleProgram {

	public static void main(String[] args) {

		System.out.println("=========a============");
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < 3; i++) {

			stringBuilder.append("|");

			for (int j = 0; j < 3; j++) {

				if (i + j == 2 || (i == 1 && j == 2)) {
					stringBuilder.append("X|");
				} else if (i == 2 && j == 1) {
					stringBuilder.append(" |");
				} else {
					stringBuilder.append("O|");
				}

			}

			stringBuilder.append("\n");

		}

		System.out.println(stringBuilder.toString());

		System.out.println("=========b============");

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = reader.nextInt();

		reader.close();

		stringBuilder = new StringBuilder();

		int tab1 = 0;
		int tab2 = 0;

		for (int i = 0; i < size; i++) {

			System.out.println("1 ");

			for (int j = 0; j < i; j++) {


			}

			System.out.println("\n");

		}

	}
}
