package javaArrayProgram;

public class ArrayAddLastElementToarray
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int num=10;
		
		int newarr[]=new int[arr.length+1];
		//newarr[arr.length]=num; we can add that element at early stage also
		for(int i=0;i<arr.length;i++)
		{
			newarr[i]=arr[i];
			
		}
		newarr[arr.length]=num;
			
		
		for(int i=0;i<arr.length+1;i++)
		{
			System.out.println(newarr[i]);
		
		}
		
		
	}
}
