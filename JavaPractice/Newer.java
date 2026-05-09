import java.util.Scanner;

class Newer{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first value");
	 	int x=sc.nextInt();
		
		System.out.println("Enter the second value");
		int y=sc.nextInt();
		
 		int res=x/y;
		System.out.println("the division of x and y is\t" + res);
		
		int mod=x%y;
		System.out.println("the modulo of x and y is\t" + mod);
		}
}
	



