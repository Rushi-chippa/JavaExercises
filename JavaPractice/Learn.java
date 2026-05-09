class Learn{
		public static void main(String[] args){
		Learn sc= new Learn();
		Learn sc1= sc;
		Learn sc2= sc1;
		System.out.println("addres is" + sc);
		System.out.println("addres is" + sc1);
		System.out.println("addres is" + sc2);


		Tester t1=new Tester();
		Tester t2=t1;
		Tester t3= new Tester();
		System.out.println("addres is" + t1);
		System.out.println("addres is" + t2);
		System.out.println("addres is" + t3);

	}
}


class Tester{
}