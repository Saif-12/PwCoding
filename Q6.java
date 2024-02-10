package AssignmentQuestion_Conditions;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		System.out.println("Enter sides of trianlge");
		Scanner s=new Scanner(System.in);
		
		int side1=s.nextInt();
		int side2=s.nextInt();
		int side3=s.nextInt();
		if(side1+side2>side3)
		{
			if(side1 == side2 && side2==side3) System.out.println("equilateral triangle");
			else if(side1 == side2 && side2!=side3)  System.out.println("Isosceles triangle");
			else System.out.println("scalene triangle");
		}
		else
		{
			System.out.println("Cant form a triangle");
		}
		
	}

}
