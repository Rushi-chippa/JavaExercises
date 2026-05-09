import java.util.Scanner;

class Bite{
	public static void main(String[] args){
		int a;
		long b;
    	  	float c;
	      	double d;
		Scanner sc= new Scanner(System.in);
		     System.out.println("enter the number in integer ");
		     a=sc.nextInt();
		     System.out.println("Binary value of integer\t" + Integer.toBinaryString(a));
		      System.out.println("octal value of integer\t" + Integer.toOctalString(a));
			System.out.println("Hexa value of Integer\t " + Integer.toHexString(a));
			 System.out.println("\n");

		      System.out.println("enter the number in long ");
		      b=sc.nextLong();
		      System.out.println("Binary value of Long\t" + Long.toBinaryString(b));
		       System.out.println("Hexa value of Long\t" + Long.toHexString(b));
		        System.out.println("octal value of long\t" + Long.toOctalString(b));
 
 		//c=sc.nextFloat();
		     // System.out.println("Binary value of float\t" + Float.toBinaryString(c));
		  //         System.out.println("Hexa value of float\t" + Float.toHexString(c));
		    //    System.out.println("octal value of float\t" + Float.toOctalString(c));


			/*System.out.println("enter the number in double ");
 			 d=sc.nextLong();
		      System.out.println("Hexa value of double\t" + Double.toHexString(d)); */

			System.out.println("\n");
	  	  
                     int e=0B1010;
			System.out.println("entered value in decimal form is" +e);
		   	//e=sc.nextInt();
			    System.out.println("Decimal value is \t" +Integer.toBinaryString(e));

		        int i1;
			System.out.println("i1 value is ");
			 i1=sc.nextInt();
			   System.out.println("i1 value in binary is" + Integer.toBinaryString(i1));

  	}
}
