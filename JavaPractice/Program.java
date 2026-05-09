// program on assignment arithmetic program

import java.util.Scanner;

class Program{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first value");
		int x= sc.nextInt();

		System.out.println("Enter the first value");
		int y= sc.nextInt();
		
		System.out.println("\n");
	
		int res= x += y;
		System.out.println(+ res);

		 int res1 = x -= y;
		System.out.println(+ res1);
	
		res = x *= y;
		System.out.println(+ res);
	
		x /= y;
		System.out.println(+ x);
	
		x %= y;
		System.out.println(+ x);
	

	}
}
		