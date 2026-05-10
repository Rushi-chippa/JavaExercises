import java.util.Scanner;

class Exercise8{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter the first value");
		  int x=sc.nextInt();
	
		  System.out.println("enter the second value");
		  int y=sc.nextInt();

		boolean b1=x>y;
		System.out.println("x is greater than y" + b1);
		  
		b1=x<y;
		 System.out.println("x is less than y" + b1);
	
		b1=x>=y;
		  System.out.println("x is greater than or equal to y" + b1 );
		
		b1=x<=y;
		  System.out.println("x is less than or equal to y" + b1);

		b1=x==y;
		    System.out.println("x is  equal to y" + b1);
		
		b1=x!=y;
		  System.out.println("x is not equal to y" + b1 );

		  System.out.println((x>y&&y>x));

		  System.out.println((x<y||y<x));

		  System.out.println((x&y));

		  System.out.println((x|y));

		  System.out.println((x^y));

		  System.out.println(x>>1);

		  System.out.println(x<<2);

		  System.out.println((x>>>y));

	}
}