import java.util.Scanner;

class Exercise4{
	public static void main(String[] args){
		int a= 0b1010;
		System.out.println("binary value in integer is" + a);

		byte b3=0b101;
		System.out.println("decimal value of binary in byte is" + b3);

		short s4=0b101;
		System.out.println("decimal value of binary in short is" + s4);

		int res= b3 + s4;		
		System.out.println(" add of short and byte in binary form" + res);


		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer value");
		int b= sc.nextInt();
		System.out.println("integer value after converted into binary is\t" + Integer.toBinaryString(b));
		

		System.out.println("enter the long value is");
		long l1= sc .nextLong();
		System.out.println("Long value after converted into binary is\t" + Long.toBinaryString(l1));
		
	

	}
}