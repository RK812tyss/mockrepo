package javaStringProgram;

import java.util.Arrays;

public class LengthWithoutLenMethodInString {

	public static void main(String[] args)
	{
		
		String str="YoyoHoneySingh";
		int strlength=0;
		char[] ch=str.toCharArray();
		
		System.out.println(ch);
		
		System.out.println(Arrays.toString(ch));// string representation of array
		for(char x:ch)
		{
			strlength++;
			System.out.print(x);
		}
		
		System.out.println("\n"+strlength);
		
		
	}

}
