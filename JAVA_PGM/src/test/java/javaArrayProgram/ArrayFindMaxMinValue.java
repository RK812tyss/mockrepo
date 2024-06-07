package javaArrayProgram;

public class ArrayFindMaxMinValue {

	public static void main(String[] args)
	{
		int arr[]= {18,21,10,47,58};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{

			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=1;i<arr.length;i++)
		{

			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println(min);
		System.out.println(max);
}
}