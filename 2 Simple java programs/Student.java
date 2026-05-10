import java.util.Scanner;

class Student{
   	public static void main(String[] args){
	  Scanner sc= new Scanner(System.in);
	   System.out.println("enter maths subjects marks:");
	    int math= sc.nextInt();

	    System.out.println("enter statistics subjects marks:");
	    int stat= sc.nextInt();

	    System.out.println("enter english subjects marks:");
	    int eng= sc.nextInt();

	     System.out.println("enter hindi subjects marks:");
	    int hin= sc.nextInt();
         
	      System.out.println("enter marathi subjects marks:");
	    int mar= sc.nextInt();

		int total=math+stat+eng+hin+mar;
		   System.out.println("total is :" + total);

		  int avg=total/5;
		   System.out.println("average is :" + avg);
 	 
		
		 double per=(total/500.0)*100;
		   System.out.println("student percentage :" + per);
 
	}
}

 		
		   