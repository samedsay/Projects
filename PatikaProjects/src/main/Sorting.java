package main;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers to sort them: ");

		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();

		if (first >= second && first >= third) {
			if (second >= third) {
				System.out.println(first + " > " + second + " > " + third);

			} else {
				System.out.println(first + " > " + third + " > " + second);

			}
		} else if (second >= first && second >= third) {
			if (first >= third) {
				System.out.println(second + " > " + first + " > " + third);

			} else {
				System.out.println(second + " > " + third + " > " + first);

			}

		}
		if (third >= first && third >= second) {
			if (first >= second) {
				System.out.println(third + " > " + first + " > " + second);

			} else {
				System.out.println(third + " > " + second + " > " + first);

			}
		}

	}

}
