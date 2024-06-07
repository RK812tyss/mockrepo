package javaArrayProgram;

import java.util.Arrays;

public class ArrayMerging {

	public static void main(String[] args)
	{
		int[] arr1= {23,56,78};
		int[] arr2= {45,26,98};
		int[] arr3=new int[arr1.length+arr2.length];
		System.out.println(Arrays.toString(arr3));
		int j=0;
		for(int i=0;i<arr3.length;i++)
		{
			if(i<arr1.length)
			{
				arr3[i]=arr1[i];
			}
			else
			{
				arr3[i]=arr2[j++];
			}
		}
		System.out.println(Arrays.toString(arr3));
	}

}
