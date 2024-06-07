package javaStringProgram;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		String str="malayalam";
		String res="";
		char[] arr= str.toCharArray();
		System.out.println(Arrays.toString(arr));	
		
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&& arr[j]!='@')
				{
					arr[j]='@';
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!='@')
			{
				res=res+arr[i];
			}
		}
		System.out.println(res);
				
		
		

	}

}
