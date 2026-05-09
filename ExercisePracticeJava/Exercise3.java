
import java.util.Scanner;

class Exercise3{
	public static void main(String[] args){

	Scanner sc= new Scanner(System.in);
	System.out.println("enter the long value");
	long l=sc.nextLong();
	byte b=(byte) l;
	System.out.println("long value is converted into byte is " + b);

	}
}