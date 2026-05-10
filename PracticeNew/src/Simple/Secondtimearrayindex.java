package Simple;

import java.util.Scanner;

public class Secondtimearrayindex {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of elements you want to insert ");
		int num = sc.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements in array at index :" + (i));
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the target element you want to check the indexes");
		int target = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == target && arr[i] != arr[j]) {

					System.out.println("The elements are " + arr[i]);
					System.out.println("The elements are " + arr[j]);

				}
			}

		}

		System.out.println("Printing the elements index");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == target && arr[i] != arr[j]) {

					System.out.println("The elements are " + arr[i] + " and there index is " + (arr[i] - 1));
					System.out.println("The elements are " + arr[j] + " and there index is " + (arr[j] - 1));

				}
			}
		}
	}
}
