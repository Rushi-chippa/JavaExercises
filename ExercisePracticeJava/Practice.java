
import java.util.Scanner;

class Practice{
	public static void main(String[] args){
		


	/*	int a;
		byte b;
		char c;
		float f;
		a=97;
		System.out.println("integer value is" + a);
		 
		b= (byte)a;
		System.out.println("integer value in byte" + b);

		c=(char)a;
		System.out.println("integer value in char\t" + c);
	
		f=(float)a;
		System.out.println("integer value in float" + f);  */

		//user inputs
		
		int a;
		byte b;
		char c;
		float f;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any integer number");
		a= sc.nextInt();

		b=(byte)a;
		System.out.println("interger value in byte is\t" + b);
	
		c =(char) a;
		System.out.println("interger value in char is\t" + c);
	
		f =(float) a;
		System.out.println("integer value in float is\t" + f);

	}
}
		