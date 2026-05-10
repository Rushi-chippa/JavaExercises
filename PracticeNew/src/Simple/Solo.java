package Simple;

import java.util.Scanner;

public class Solo {

	static double balance = 0;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int choice = 0;

		while (choice != 4) {
			System.out.println("Enter 1 for Deposit ");
			System.out.println("Enter 2 for Withdraw ");
			System.out.println("Enter 3 for Balance ");
			System.out.println("Enter 4 for Exit ");

			int num = sc.nextInt();

			switch (num) {
			case 1 -> deposit();
			case 2 -> withdraw();
			case 3 -> balance();
			default -> System.out.println("Exit");

			}
		}

	}

	private static void balance() {

		System.out.println("The available balance is " + balance);

	}

	private static void withdraw() {
		System.out.println("Enter the Amount you want to withdraw");
		int amount = sc.nextInt();
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient balance");
		}

	}

	private static void deposit() {
		System.out.println("Enter the Amount you want to deposit");
		int amount = sc.nextInt();

		balance = balance + amount;
		System.out.println("After Depositing the balance is " + balance);
	}

}
