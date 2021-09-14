package main;

import java.util.Scanner;

public class PlaneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalPrice = 0;
		double discount = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Distance in km: ");
		int distance = scanner.nextInt();

		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("One way(1) or return(2): ");
		int type = scanner.nextInt();
		
		if(distance <= 0 || age <= 0 || !(type == 1 || type == 2)) {
			System.out.println("Incorrect inputs!!!");
		}else {
			totalPrice = distance * 0.1;
			discount = 0;
			if(age < 12) {
				discount = totalPrice * 0.5;
			}else if(age < 24) {
				discount = totalPrice * 0.1;
			}else if(age > 65) {
				discount = totalPrice * 0.35;
			}
			
			totalPrice -= discount;
			
			if(type == 2) {
				discount = totalPrice * 0.2;
			}
			totalPrice -= discount;
		}
		
		
		System.out.println("Total charge: " + totalPrice + " TL");
	}

}
