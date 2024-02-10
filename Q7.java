package AssignmentQuestion_Conditions;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		System.out.println("Enter 3 numbers");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		
		if(num1<num2)
		{
			if(num2<num3)
			{
				System.out.println("num1 is smallest");
			}else System.out.println("num3 is smallest");
		}else
		{
			if(num1<num3) System.out.println("num2 is smallest");
			else System.out.println("num3 is smallest");
		}

	}

}
