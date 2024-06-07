package javaArrayProgram;

import java.util.Arrays;

public class ArraysortInAscendingOrder {
	static int arr[]= {45,67,23,34,18,79};
	public static void main(String[] args) 
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					swap(i,j);
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
	
	}
	
	public static void swap(int i,int j)
	{
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
	}


}