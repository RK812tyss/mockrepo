package JAVA;

import java.util.Scanner;

import org.testng.annotations.Test;

public class palindrome
{


	@Test

	public void palindrome1()
	{
		
		String str="godog";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(rev.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
	@Test

	public void reverseWord()
	{
		String str="hi hello welcome";
		String[] s=str.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}
	@Test

	public void swapFirstLastWord()   //to hello welcome hi
	{
	
		String s="hi hello welcome to";
		String[] str = s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}	
		@Test

		public void ReverseEachWordIndividually()
		{	
			String s="hi hello welcome to";
			String[] str = s.split(" ");
			
			
			for(int i=0;i<str.length;i++)
			{
				String rev=str[i];
				for(int j=rev.length()-1;j>=0;j--)
				{
					System.out.print(rev.charAt(j));
				}
				System.out.print(" ");
			}
	    }
	
		@Test

		public void impReverseScenerio() //em oclew ollehih
		{
			String st="hi hello welcome";  //to print space
			
			String s=st.replace(" ",""); //remove space
			
			int j=s.length()-1;
			
			//System.out.println(j);
			
			for(int i=0;i<st.length();i++)
			{
				if(st.charAt(i)!=' ')
				{
					System.out.print(s.charAt(j--));
				}
				
				else
				{
					System.out.print(st.charAt(i));
				}
			}
			
			
			
		}
		
		@Test

		public void palindromeNumber() 
		{
			System.out.println("enter the number");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int copy=num;  //num will be destroyed so copy is required
			int rev=0;
			while(num>0)   
			{
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(copy==rev)
			 System.out.println("palindrome");
				
			
			else
				System.out.println("not a palindrome");
			
		}
		
		@Test

		public void reverseWordinterview()
		{
			String str="my name is ty";
			String[] s=str.split(" ");
			for(int i=s.length-1;i>=0;i--)
			{
				System.out.print(s[i]+" ");
			}
		}
		
		@Test

		public void reverseWordinterview2()
		{	
			String str="my name is ty.your name is king";
			String[] s=str.split("\\.");
			String rev=s[0];
			String[] s1=rev.split(" ");
			for(int i=s1.length-1;i>=0;i--)
			{
				System.out.print(s1[i]+" ");
			}
			System.out.print(s[1]);
			
			
			
		}
		
}
	
