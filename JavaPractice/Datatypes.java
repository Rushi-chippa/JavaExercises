class Datatypes{
	public static void main(String[] args){
		System.out.println("programme related to integral data types");
 		  byte b1=127; 	
		    	System.out.println("byte range in positive "  + b1);					        //the range of byte type is (-128 to 127)
		   byte b2=-128; 	
		    	System.out.println("byte range in negative " + b2);
		 /* byte b3;			//variable declaration			
		   b2=128;*/			//variable assignment			invalid		        //it throws error bcoz it is beyond the range

                  short s1=32767;   		//variable initialization				        //the range of short type is (-32768 to 32767)
			System.out.println("short range in positive " + s1);
		  short s2=-32768;              //variable initialization							
			System.out.println("short range in negative " + s2);
	   	//short s3=32768;               							        //it throws error bcoz it is beyond the range

		  int i1=2147483647;     	//variable initialization		valid	 	        //the range of int type is (-2147483648 to 2147483647)
			System.out.println("int range in positive " + i1);
		  int i2=-2147483648;							//valid
			System.out.println("int range in negative " + i2);
		  long l1=9223372036854775807L;  //variable initialization		valid	//the range of int type is (-9223372036854775808L to 9223372036854775807)
			System.out.println("long range in positive " + l1);
		  long l2=-9223372036854775808L;  				        //invalid		//it throws error bcoz it is beyond the range
			System.out.println("long range in negative " + l2);
           }
}
