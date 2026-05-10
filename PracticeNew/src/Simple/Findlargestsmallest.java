package Simple;

public class Findlargestsmallest {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int arr[] = { 17, 2, 13, 4, 15 };

		int small = arr[0];
		int large = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < small) {
				small = arr[i];
			}

		}
		System.out.println(small);

	}

}
