package Simple;

public class TargetArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 4, 5 };

		int target = 10;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("The target element " + arr[i] + " is found at index " + i);
			}
			
		}

	}

}
