package AssignmentQuestion_Conditions;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		System.out.println("Enter year");
		Scanner s=new Scanner(System.in);
		
		int year=s.nextInt();
		
		boolean leap_year=false;
		
		leap_year = year%4==0 && year%100!=0 || year%400==0?true:false;
		
		
		if(leap_year)System.out.println("leap year");
		else System.out.println("Not leap year");
			
		
		
	}
}
