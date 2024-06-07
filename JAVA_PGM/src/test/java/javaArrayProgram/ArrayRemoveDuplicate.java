package javaArrayProgram;

import java.util.Arrays;

public class ArrayRemoveDuplicate {

	public static void main(String[] args)
	{
		int[] arr= {6,5,6,5,2};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&& arr[j]!=-1)
				{
					arr[j]=-1;
					count++;
				}
			}
		}
            System.out.println(Arrays.toString(arr));

		int newarr[]=new int[arr.length-count];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=-1)
			{
				newarr[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(newarr));
		
				

	}

}
