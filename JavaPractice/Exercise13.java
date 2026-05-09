import java.util.Scanner;

class Exercise13{
		public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();

		if(x%2==0)
		{
		   System.out.println("you entered even number");
		}
		else
		{
		   System.out.println("you entered odd number");
		}
	}
}