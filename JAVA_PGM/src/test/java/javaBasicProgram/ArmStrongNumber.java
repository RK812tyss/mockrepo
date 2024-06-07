package javaBasicProgram;

import java.util.Scanner;

public class ArmStrongNumber { //153

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int copy=num;
		int temp=num;
		int pow=0;
		int sum=0;
		while(num>0)
		{
			num=num/10;
			pow++;
		}
		
		while(copy>0)
		{
			int rem=copy%10;
			int res=power(rem,pow);
			sum=sum+res;
			copy=copy/10;
			
		}
		if(sum==temp)
			
			System.out.println("ArmStrong number");
		
		else
			System.out.println("Not an ArmStrong number");
		
		}

	 static int power(int rem, int pow) 
	 {
		 int prod=1;
	 for(int i=1;i<=pow;i++)
	 {
		 prod=prod*rem;
	 }
		
		return prod;
	}

}
