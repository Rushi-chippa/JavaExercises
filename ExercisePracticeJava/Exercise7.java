//using relational operators
import java.util.Scanner;

class Exercise7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first values");
		int x= sc.nextInt();

		System.out.println("enter the second values");
		int y= sc.nextInt();

		
		System.out.println("x is greater than y \t" + (x>y));

		
		System.out.println("x is less than y \t" + (x<y));

		
		System.out.println("x is less than or equal to y \t" + (x<=y));

		
		System.out.println("x is greater than or equal to y \t" + (x>=y));


		System.out.println("x is equal to y \t" + (x==y));

		}
}