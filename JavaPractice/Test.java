import java.util.Scanner;
 
class Test{
  public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the student maths marks");
		   int stu1=sc.nextInt();

		   System.out.println("enter the student statistics marks");
		   int stu2=sc.nextInt();

   	  	    System.out.println("enter the student science marks");
		   int stu3=sc.nextInt();
	
		     System.out.println("enter the student physics marks");
		   int stu4=sc.nextInt();

		     System.out.println("enter the student computer science marks");
		   int stu5=sc.nextInt();

		   int res = stu1+stu2+stu3+stu4+stu5;
		     System.out.println("the total marks of all subject of student are:" + res);
 
		 	System.out.println("\n");
  	 
		   int avg = stu1+stu2+stu3+stu4+stu5/5;
		   System.out.println("the average marks of all subject of student is:" + avg);

 	   }
}