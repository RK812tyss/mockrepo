package javaStringProgram;

import java.util.Arrays;

public class DuplicateCharInString {

	public static void main(String[] args) 
	{ String str="malayalam";
	char[] arr= str.toCharArray();
	Arrays.sort(arr);
	for(int i=0;i<=arr.length;i++)
	{
		int j=i+1;
		if(arr[i]==arr[j])
		{
		System.out.println(arr[j]);	
		}
	}
	
	}

}
