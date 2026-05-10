package Simple;

public class Numsum {

	public static void main(String[] args) {

		int num = 15555;
		int res = 0;
		int add = 0;
		for (int i = 0; i < 5; i++) {
			res = num % 10;
			add = add + res;
			num = num / 10;

		}

		System.out.println(add);
		
	}

}
