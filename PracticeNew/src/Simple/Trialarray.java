package Simple;

public class Trialarray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int target = 6;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == target && arr[i] != arr[j]) {

					System.out.println("The first element number is " + arr[i]);
					System.out.println("The second element number is " + arr[j]);

				}
			}
		}

		System.out.println();
		System.out.println("Printing the index numbers ");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == target && arr[i] != arr[j]) {
//				if (arr[i] + arr[j] == target) {

					System.out.println("The element " + arr[i] + " index number is " + (arr[i] - 1));

					System.out.println("The element " + arr[j] + " number is " + (arr[j] - 1));

				}
			}
		}
	}

}
