package main;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = scanner.nextInt();

		if (year % 400 == 0) {
			System.out.println("Leap Year!");
		} else if ((year % 100 != 0) && (year % 4 == 0)) {
			System.out.println("Leap Year!");
		} else {
			System.out.println("Not a Leap Year!");

		}

	}

}
