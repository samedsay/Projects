package main;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
	
		for(int i = 1; i <= number; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
