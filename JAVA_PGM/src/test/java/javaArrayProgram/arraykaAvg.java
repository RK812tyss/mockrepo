package javaArrayProgram;

public class arraykaAvg {

	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println(avg);

	}

	

}
