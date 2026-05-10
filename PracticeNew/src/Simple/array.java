package Simple;

import java.util.Scanner;

public class array {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
//                System.out.print("Enter element at position arr[" + i + "][" + j + "]: ");
				System.out.println("Enter element at position " + i + " " + j);
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nPrinting the elements:");

		// Printing array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
