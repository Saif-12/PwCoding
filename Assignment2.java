package SortingAlgorithmAssignment;

public class Assignment2 {
	
	public static void print(int arr[])
	{
		int n=arr.length;
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {4,3,2,1,6};
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int max=Integer.MIN_VALUE;
			int maxIndex=-1;
			for(int j=n-1-i;j>=0;j--)
			{
				if(arr[j]>max)
				{
					max=arr[j];
					maxIndex=j;
				}
			}
			int temp=arr[n-1-i];
			arr[n-1-i]=arr[maxIndex];   //putting kth maximum element at right position
			arr[maxIndex]=temp;
		}
		print(arr);
	}

}
