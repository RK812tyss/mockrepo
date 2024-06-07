package JAVA;

import java.util.Arrays;

import org.testng.annotations.Test;

public class reverseString 
{

	@Test

	public void ReverseString()
	{
		String str="Bangalore";
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
	}
	
	@Test

	public void ReverseString2()
	{
		String str="Bangalore";
		
	char[] c = str.toCharArray();
	for(int i=c.length-1;i>=0;i--)
	{
		System.out.print(c[i]);
	}
	
	}
	

	@Test

	public void ReverseString3()
	{
		
		StringBuffer s = new StringBuffer("Bangalore");
		System.out.println(s.reverse());
	}
	
	
}
