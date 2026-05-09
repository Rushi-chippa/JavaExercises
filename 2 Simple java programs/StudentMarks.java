import java.util.Scanner;

class StudentMarks{

	public static void main(String[] args){
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter maths subject");
	 int math=sc.nextInt();
	
	System.out.println("enter english subject");
	 int eng=sc.nextInt();

	System.out.println("enter statistics subject");
	 int stat=sc.nextInt();

	int total=math + eng + stat;
	int avg=total/3;
	System.out.println("total marks of student is:" + total);
	System.out.println("average is :" + avg);

	if(math>=35 && eng>=35 && stat>=35)
	 {
	  System.out.println("student is passed");
		if(avg > 75)
		{
		  System.out.println("Grade A");
		 }
		 else if (avg>50)
		{
		  System.out.println("Grade B");
		}
		else if(avg>35)
		{
		System.out.println("Grade c");
		}
		else
		{
		  System.out.println("Grade D");
		}
		
  	 }
		else
		{
	 	 System.out.println("student is failed");
		}
   }
}




   