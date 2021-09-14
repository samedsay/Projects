package main;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year of birth: ");
		int threshold = scanner.nextInt();

		for (int i = 1; i < threshold; i *= 4) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 1; i < threshold; i *= 5) {
			System.out.print(i + " ");
		}

	}

}
