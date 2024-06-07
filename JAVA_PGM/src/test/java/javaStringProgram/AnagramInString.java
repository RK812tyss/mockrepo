package javaStringProgram;
import java.util.Arrays;

import java.util.Scanner;

public class AnagramInString
{
	static Scanner sc=new Scanner(System.in);
	static String str1;
	static String str2;

	public static void main(String[] args) 
	{
		System.out.println("enter 1st string");
		str1=sc.next();
		System.out.println("enter 2nd string");
		str2=sc.next();
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
	ch1=sort(ch1);
	ch2=sort(ch2);
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		
		boolean flag=true;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i]) 
			{
				flag=false;
				break;
			}
		}
		if(flag==true) 
		{
			System.out.println("ANAGRAM FOUND");
		}
		else
		{
			System.out.println("ANAGRAM NOT FOUND");
		}
}

	public static char[] sort(char[] ch1) 
	{
		for(int i=0;i<ch1.length;i++) 
		{
			for(int j=i+1;j<ch1.length;j++) 
			{
				if(ch1[i]>ch1[j])
				{
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
			}
			
		}
		return ch1;
	}
}