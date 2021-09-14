package main;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		int total = 0;
		while(number % 2 == 0) {
			if(number % 4 == 0) {
				total += number;
			}
			number = scanner.nextInt();
		}
		System.out.println("Total = " + total);
	}

}
