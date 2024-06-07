package javaBasicProgram;

import java.util.Scanner;

public class StrongNumber {  //145
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int copy=num;
		
		int sum=0;
		
		while(num>0)
		{	int fact=1;		//very imp to declare here
			int rem=num%10;
		for(int i=1;i<=rem;i++)
		{
			 fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
		
		}
		System.out.println(sum);
		
		if(sum==copy)
		
			System.out.println("Strong number");
		
		else
			System.out.println("Not a Strong number");
	}

}
