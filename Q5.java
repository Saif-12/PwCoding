package AssignmentQuestion_Conditions;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		
		System.out.println("Enter 3 numbers");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				
				System.out.println(num1+ " is greatest");
			}else
			{
				System.out.println(num3+ " is greatest ");
			}
		}else
		{
			if(num2>num3)
			{
				System.out.println(num2+ " is greatest");
			}else
			{
				System.out.println(num3+ " is greatest");
			}
			
		}
		
	}

}
