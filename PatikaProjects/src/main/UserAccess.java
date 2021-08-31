package main;

import java.util.Scanner;

public class UserAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your username: ");
		String userName = scanner.nextLine();

		System.out.println("Enter your password: ");
		String password = scanner.nextLine();

		if (userName == "Patika" && password == "Patika12345") {
			System.out.println("Successfully logged in!");
		} else {
			System.out.println("Do you want to change your password?(Yes/No)");
			String answer = scanner.nextLine().toLowerCase();
			boolean checker = answer.equals("yes") ? true : false;
			while (checker == true) {
				System.out.println("Enter new password!");
				password = scanner.nextLine();
				if (password == "Patika12345") {
					System.out.println("Please change your password!");
					continue;
				} else {
					System.out.println("New password is created!");
					break;
				}
			}
			System.out.println("Bye!");
		}

	}

}
