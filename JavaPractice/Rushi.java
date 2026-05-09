//program on ternary type i.e. ?: this is the only operator in java is ternary

class Rushi{
	public static void main(String[] args){
		String r= 20>10 ? "hello world" : "hello java" ;
		System.out.println(r);

		int res= 20 < 10 && 21 == 22 ? 10 < 11 ? 10: 11: 12 ;
		System.out.println(res);

		char c= 10 < 20 || 10 > 20 ? 10>20? 'a' : 'b' : 'c' ;
		System.out.println(c);
	}
}