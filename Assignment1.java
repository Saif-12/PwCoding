package SortingAlgorithmAssignment;

public class Assignment1 {
	
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
		
		int arr[]= {3,1,2,5,4};   //sort in decreasing order using bubble sort
		print(arr);
		
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			boolean flag=true;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag==true) break;
		}
		
		print(arr);

	}
}
