package main;

import java.util.Scanner;

public class ClassPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Math grade: ");
		int math = scanner.nextInt();
		System.out.println("Enter your Physical grade: ");
		int physical = scanner.nextInt();
		System.out.println("Enter your Literature grade: ");
		int literature = scanner.nextInt();
		System.out.println("Enter your Chemistry grade: ");
		int chemistry = scanner.nextInt();
		System.out.println("Enter your Music grade: ");
		int music = scanner.nextInt();

		int courseNumber = 0;

		if (math >= 0 && math <= 100)
			courseNumber++;
		if (physical >= 0 && physical <= 100)
			courseNumber++;
		if (literature >= 0 && literature <= 100)
			courseNumber++;
		if (chemistry >= 0 && chemistry <= 100)
			courseNumber++;
		if (music >= 0 && music <= 100)
			courseNumber++;

		int average = (math + physical + literature + chemistry + music) / courseNumber;

		if (average >= 55) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");

		}

	}

}
