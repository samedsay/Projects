package main;

import java.util.Scanner;

public class WeatherOffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weather degree: ");
		int heat = scanner.nextInt();

		if (heat < 5) {
			System.out.println("Kayak!!!");
		} else if (heat >= 5 && heat <= 15) {
			System.out.println("Sinema!!!");
		} else if (heat > 15 && heat <= 25) {
			System.out.println("Piknik!!!");
		} else {
			System.out.println("Yüzme!!!");
		}

	}

}
