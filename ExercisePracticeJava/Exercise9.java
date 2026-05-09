import java.util.Scanner;

class Exercise9{
	public static void main(String[] args){
	   int a,b,c,d;
	 Scanner sc= new Scanner(System.in);
	  System.out.println("enter the first value");
	  a=sc.nextInt();
	   System.out.println("enter the first value");
	  b=sc.nextInt();
	  System.out.println("enter the first value");
	  c=sc.nextInt();
	  d=c>(a>b?a:b)?c:(a>b?a:b);
	  System.out.println("greater number is" + d);

	}
}	  