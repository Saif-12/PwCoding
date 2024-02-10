package AssignmentQuestion_Conditions;

import java.util.Scanner;

public class Q3 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter prices");
		Scanner s=new Scanner(System.in);
		
		int costPrice=s.nextInt();
		int sellingPrice=s.nextInt();
		
		int val=sellingPrice-costPrice;
		
		if(val>0)
		{
			System.out.println("Profit "+val);
			
		}
		else if(val<0)
		{
			System.out.println("Loss "+(-1*val));
		}
		else
		{
			System.out.println("even-break "+val);
		}
		
	}

}
