import java.util.Scanner;

class Exercise10{
	public static void main(String[] args){
		 int a,b,c,d,e;
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter the first value");
		 a= sc.nextInt();
		 
		 b=++a;
		 System.out.println("increment value is" +a);
		 System.out.println("increment value is" +b);

		 System.out.println("\n");

		  c=a++;
		 System.out.println("increment value is" +a);
		 System.out.println("increment value is" +c);

		 System.out.println("\n");


		 d=--a;
		 System.out.println("decreament value is" +a);
		 System.out.println("decreament value is" +d);

		 System.out.println("\n");


		e=a--;
		 System.out.println("decreament value is" +a);
		 System.out.println("decreament value is" +e);

	}
}