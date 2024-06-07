package JAVA;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class NumberPgm 
{
	@Test

	public void primeNumberRange()
	{
		for(int i=1;i<=30;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
	              if(i%j==0)
	              {
	            	  count++;
	              }

			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
	
	@Test

	public void checkprimeNumber()
	{
		
		int num=7;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{		
		if(num%i==0)
		{
			count++;
		}
		}
		}
		if(count>2)
		{ System.out.println("not a prime no.");
			
		}
		else
			System.out.println(" a prime no.");
	}
	@Test

	public void factorial()
	{
	int num=5;
	int fact=1;
	
	for(int i=num;i>=1;i--) 
	{
		fact=fact*i;
		
	}
	System.out.println(fact);
	
	}
	
	@Test

	public void fibonnaci()
	{
		int f=0;
		int s=1;		
		int count=10;
		System.out.println(f+"\n"+s);
		for(int i=3;i<=count;i++)
		{
			int t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}
	}
	@Test

	public void anagram()
	{
		String str1="arc";
		String str2="car";
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		boolean flag=true;
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
//		for(int i=0;i<ch1.length;i++) 
//		{
//			for(int j=i+1;j<ch1.length;j++)
//			{
//				if(ch1[i]>ch1[j])
//				{
//					char temp=ch1[i];
//					ch1[i]=ch1[j];
//					ch1[j]=temp;
//				}
//			}
//			
//		}
//		for(int i=0;i<ch2.length;i++) 
//		{
//			for(int j=i+1;j<ch2.length;j++)
//			{
//				if(ch2[i]>ch2[j])
//				{
//					char temp=ch2[i];
//					ch2[i]=ch2[j];
//					ch2[j]=temp;
//				}
//			}
//			
//		}
		
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
	
	@Test

	public void IntegerPalindrome()
	{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int copy=num;  
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

	public void printPattern()  //output:1 3 7 15 31
	{
		int num=0;
		for(int i=1;i<6;i++)
		{
			num=num*2+1;
			System.out.print(num+" ");
		}
	}
	
	@Test

	public void occurrence()
	{
		String str="carbustraincarbustrainbus";
		  String substring = "bus";
	        int count = 0;
	        int idx = 0;

	        while ((idx = str.indexOf(substring, idx)) != -1) {
	            count++;
	            idx += substring.length();
	        }

	        System.out.println("The substring '" + substring + "' occurs " + count + " times.");
	    }
	
	@Test

	public void Stringpgm()
	{
		String s[]= {"abc","bcdf","bd","tdsss","bd"};
		
		String max_len = s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>max_len.length())
			{
				max_len=s[i];
			}
		}
		
		System.out.println(max_len);
	}
	}
	
	
	
	

