package javaBasicProgram;

import java.util.Scanner;

public class SpyNumber {   //22,123

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		int prod=1;
		while(num>0)
		{
			int rem=num%10;
			prod=prod*rem;
			sum=sum+rem;
			num=num/10;			
		}
		
		if(sum==prod)
			
			System.out.println("Spy number");
		
		else
			System.out.println("Not a Spy number");

	}

}
