import java.util.Scanner;

class Exercise6{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first value");
		int a= sc.nextInt();
		
		System.out.println("enter the first value");
		int b= sc.nextInt();

		System.out.println("for addition press 1");
		
		System.out.println("for subtraction press 2");

		System.out.println("for multiplication press 3");

		System.out.println("for division press 4");

		System.out.println("for modulo press 5");


		int n= sc.nextInt();
		
		switch(n)
		{
		
		  case 1:
			int res=a+b;
			System.out.println("addition is" + res);
			break;

		   case 2:
			 res=a-b;
			System.out.println("addition is" + res);
			break;

		   case 3:
			 res=a*b;
			System.out.println("addition is" + res);
			break;

		   case 4:
			 res=a/b;
			System.out.println("addition is" + res);
			break;

		   case 5:
			 res=a%b;
			System.out.println("addition is" + res);
			break;
	
		}
	}
}