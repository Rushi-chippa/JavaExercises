package Simple;

public class TargetSum {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int arr[] = { 17, 2, 13, 4, 17 };

		int target = 17;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == target && arr[i] != arr[j]) {

					System.out.println("The element " + arr[i] + " is found at " + (arr[i - 1]));
					System.out.println("The element " + arr[j] + " is found at " + (arr[j - 1]));
				}

			}
		}

	}

}
