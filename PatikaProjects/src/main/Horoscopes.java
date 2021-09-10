package main;

import java.util.Scanner;

public class Horoscopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month of birth: ");
		int month = scanner.nextInt();

		System.out.println("Enter day of birth: ");
		int day = scanner.nextInt();

		String horoscope = "";

		switch (month) {
		case 1:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					horoscope = "Oglak";
				} else {
					horoscope = "Kova";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 2:
			if (day >= 1 && day <= 29) {
				if (day < 20) {
					horoscope = "Kova";
				} else {
					horoscope = "Balık";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 3:
			if (day >= 1 && day <= 31) {
				if (day < 21) {
					horoscope = "Balık";
				} else {
					horoscope = "Koç";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 4:
			if (day >= 1 && day <= 30) {
				if (day < 21) {
					horoscope = "Koç";
				} else {
					horoscope = "Boğa";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 5:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					horoscope = "Boğa";
				} else {
					horoscope = "İkizler";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 6:
			if (day >= 1 && day <= 30) {
				if (day < 23) {
					horoscope = "İkizler";
				} else {
					horoscope = "Yengeç";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 7:
			if (day >= 1 && day <= 31) {
				if (day < 23) {
					horoscope = "Yengeç";
				} else {
					horoscope = "Aslan";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 8:
			if (day >= 1 && day <= 31) {
				if (day < 23) {
					horoscope = "Aslan";
				} else {
					horoscope = "Başak";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 9:
			if (day >= 1 && day <= 30) {
				if (day < 23) {
					horoscope = "Başak";
				} else {
					horoscope = "Terazi";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 10:
			if (day >= 1 && day <= 31) {
				if (day < 23) {
					horoscope = "Terazi";
				} else {
					horoscope = "Akrep";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 11:
			if (day >= 1 && day <= 30) {
				if (day < 22) {
					horoscope = "Akrep";
				} else {
					horoscope = "Yay";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		case 12:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					horoscope = "Yay";
				} else {
					horoscope = "Oğlak";
				}
			} else {
				System.out.println("Geçersiz bir tarih girdiniz!");
			}
			break;
		}

		System.out.println("Burcunuz -> " + horoscope);

	}

}
