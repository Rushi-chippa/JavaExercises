package com.newtry;

import java.util.Scanner;

public class Result {
	static int eng, mar, phy, chem, math;

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ENGLISH marks");
		eng = sc.nextInt();
		System.out.println("Enter MARATHI marks");
		mar = sc.nextInt();
		System.out.println("Enter PHYSICS marks");
		phy = sc.nextInt();
		System.out.println("Enter CHEMISTRY marks");
		chem = sc.nextInt();
		System.out.println("Enter MATHS marks");
		math = sc.nextInt();

		int total = eng + mar + phy + chem + math;

		float perc = (total / (float) 5);

		System.out.println(perc);

		String res = check();
		// System.out.println(res);

		System.out.println("----------------------------------------------------------------------");
		System.out.println(
				"|              \tMaharashtra State board of                           |\n|\t Secondary and Higher Secondary education,Pune               |");
		// System.out.println("\n");
		System.out.println("|   Higher Secondary Certificate Examination - Statement of Marks    |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("|    Stream    |   Seat No   |   Center No    |   Dist.  |    Month  | ");
		System.out.println("|--------------------------------------------------------------------|");

		System.out.println("|    SCIENCE   |   P227223   |       DBF      | 56.01.35 |    MAR    | ");
		// System.out.println("\t\t\t\t\t\t& HR.SEC.School.No\t& Year of Exam ");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("|    \t\t  CANDIDATES FULL NAME(SURNAME FIRST) \t\t     |");
		System.out.println("|         \t     Chippa Rushikesh Shriniwas \t\t     |");
		System.out.println("|    \t\t   CANDIDATES MOTHER NAME:SUJATA                     |");
		System.out.println("|--------------------------------------------------------------------|");
		// System.out.println("|\t |");
		System.out.println("| Subject Code No        |Medium|Max Marks|      Marks Obtained      |          ");
		System.out.println("| & Subject Name\t |      |         |--------------------------|");
		System.out.println("| 			 |      |         | In fig |     In Words    |");
		System.out.println("|------------------------|------|---------|--------|-----------------|");
		System.out.println("|     ENGLISH            | ENG  |   100   |   " + eng + "   |                 | ");
		System.out.println("|     MARATHI            | MAR  |   100   |   " + mar + "   |                 |");
		System.out.println("|     PHYSICS            | ENG  |   100   |   " + phy + "   |                 |");
		System.out.println("|     CHEMISTRY          | ENG  |   100   |   " + chem + "   |                 | ");
		System.out.println("|     MATHEMATICS        | ENG  |   100   |   " + math + "   |                 | ");
		System.out.println("|------------------------|------|---------|--------|-----------------|");
		System.out.println("|  Result  |  Percentage | Total|         |        |                 |   ");
		System.out.println("|   "   + res + "   |     " + perc + "    | Marks|   500   |  " + total + "   |                 |   ");
		System.out.println("|------------------------|------|---------|--------|-----------------|");
		System.out.println("|                                                                    |");
		System.out.println("|                                                                    |");
		System.out.println("|                                                                    |");
		System.out.println("|                                                                    |");
		System.out.println("|                                                                    |");
		System.out.println("|                                                                    |");
		System.out.println("----------------------------------------------------------------------");

	}

	static String check() {
		String result = "";
		try {
			if ((eng >= 35) && (mar >= 35) && (phy >= 35) && (chem >= 35) && (math >= 35)) {
				// System.out.println("Pass");
				result = "pass";
			} else {
				// System.out.println("Fail");
				result = "fail";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
