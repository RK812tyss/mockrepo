package javaBasicProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
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
	

}
