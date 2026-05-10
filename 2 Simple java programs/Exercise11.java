import java.util.Scanner;
 
class Exercise11{
	public static void main(String[] args){
		int x,y,res;
		Scanner nm= new Scanner(System.in);
		System.out.println("Enter first number");
	      	  x= nm.nextInt();
		 System.out.println("Enter second number");
	      	  y= nm.nextInt();
		   System.out.println("user inputs are:");
			System.out.println(+x);
			System.out.println(+y);
		  res=x+y;
		   System.out.println("\t sum of"+ x + " and " + y + "is " + res);
		    
		    int res1=x-y;
		   System.out.println("\t subtraction of "+ x +" and " + y + "is " + res1);

			int res2=x*y;
		   System.out.println("\t multiplication of "+ x +" and " + y + " is  " + res2);


			int res3=x/y;
		   System.out.println("\t division of "+ x +" and " + y + "is " + res3);

			int res4=x%y;
		   System.out.println("\t modulo of "+ x +" and " + y + "is " + res4);
		}
}
		