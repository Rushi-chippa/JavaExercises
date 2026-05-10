package Simple;

import java.util.Scanner;

public class Bank {

	static double balance = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int choice = 0;

		while (choice != 4) {
			System.out.println();
			System.out.println("Enter 1 to Deposit the money");
			System.out.println("Enter 2 to Withdraw the money");
			System.out.println("Enter 3 to check the Balance money");
			System.out.println("Enter 4 to Exit");
			System.out.println();
			int num = sc.nextInt();

			switch (num) {
			case 1 -> deposit();
			case 2 -> withdraw();
			case 3 -> balance();
			case 4 -> System.out.println("Thank you!");
			}
		}
	}

	private static void balance() {

		System.out.println("The available balance is " + balance);
	}

	private static void withdraw() {

		System.out.println("Enter the amount you want to withdraw ");
		double amount = sc.nextDouble();
		if (amount < balance) {
			balance = balance - amount;
			System.out.println("Balance after withdrawing  " + balance);
		} else {
			System.out.println("The amount you entered is invalid");
		}

	}

	private static void deposit() {
		System.out.println("Enter the amount you want to Deposit ");
		double amount = sc.nextDouble();
		balance = balance + amount;
		System.out.println("The total balance after depositing " + balance);
	}

}
