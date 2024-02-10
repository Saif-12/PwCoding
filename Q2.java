package AssignmentQuestion_Conditions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1 = 0;
		if(n<0)
		{
			n1=-1*n;
			System.out.println("Absolute value of n "+ n1);
		}
		else
		{
			System.out.println("Absolute value of n "+ n);
		}

	}

}
