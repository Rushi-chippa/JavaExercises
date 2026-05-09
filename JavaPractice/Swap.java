import java.util.Scanner;
 
class Swap{
  public static void main(String[] args){
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value");
	 	int x=sc.nextInt();
		
		System.out.println("Enter the second value");
		int y=sc.nextInt();

		System.out.println("Before swapping the values are:" + x +" " + y);
	  	 
 		int z;
	  	z=x;
		x=y;
		y=z;

		System.out.println("After swapping the values are:" + x +" " + y);   */
		 
  	 	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value");
	 	int x=sc.nextInt();
		
		System.out.println("Enter the second value");
		int y=sc.nextInt();

		System.out.println("x value is  "+ x);
		System.out.println("y value is  "+ y);
		System.out.println("Before swapping the values are:" + x +" " + y);
		


        	//second Swapping Two Numbers Using Arithmetic Operators + and –
		x=x+y;
		y=x-y;
		x=x-y;   

                // third Swapping Two Numbers Using Arithmetic Operators ^


 	/*	  x = x ^ y; // x is now 3 (011 ^ 010 = 011)
 	          y = x ^ y; // y is now 1 (011 ^ 010 = 001)
                  x = x ^ y;    */

		 // fourth Swapping Two Numbers Using Arithmetic Operators * and /

	/*	  x = x * y; // x is now 2
    		  y = x / y; // y is now 1
   		  x = x / y; // x is now 2    */
	
		System.out.println("After swapping the values are:" + x +" " + y);
    	}
}
