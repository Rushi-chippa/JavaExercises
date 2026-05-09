class Come{
    	public static void main(String[] args){
		Come c= new Come();
		Come c1= new Come();
		Come c2= new Come();
		Come c4=c1;
		Come c5=c2;

		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c4);
		System.out.println(c5);


		Sample s= new Sample();
		Sample s1= new Sample();
		Sample s2= new Sample();
		Sample s4= s2;

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);


		Test t= new Test();
		Test t1= new Test();
		Test t2= new Test();
		Test t4= t2;

		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t4);


		Solo k= new Solo();
		Solo k1= new Solo();
		Solo k2= new Solo();
		Solo k3= k;

		System.out.println(k);
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);



	}
}


class Solo{

}