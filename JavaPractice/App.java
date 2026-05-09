import java.util.Scanner;

class App{
	public static void main(String[] args){
		int num1,num2,num3;
		  Scanner sc= new Scanner(System.in);
		   System.out.println("Enter the values");
		     num1= sc.nextInt();
		       num2= sc.nextInt();
			 System.out.println("user inputs");
			   System.out.println(num1);
			     System.out.println(num2);
				num3=num1+num2;
				   System.out.println("\tsum of"+num1+"and"+num2+"is"+num3);
		}
}