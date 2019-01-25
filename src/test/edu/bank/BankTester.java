package edu.bank;

import java.util.Scanner;

public class BankTester {
	public static void main(String[] args) {
		startApp();
	}
	
	public static void startApp( ) {
		System.out.println("Options:");
		Scanner in = new Scanner(System.in);
		int choice  = in.nextInt();
		switch (choice) {
		case 1:
			retrieveAndValidate();
			break;
		case 2:
			break;
		default:
			break;
		}
	}

	private static void retrieveAndValidate() {
	}
}
