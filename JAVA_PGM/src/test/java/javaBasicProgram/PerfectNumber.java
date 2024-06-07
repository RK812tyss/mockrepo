package javaBasicProgram;

import java.util.Scanner;

public class PerfectNumber {  // perfect no=6,28

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)  //consider all factors except no. itself
			{					  //consider only proper divisors for summation
			
			sum=sum+i;
			}	
		}
		
		System.out.println(sum);
		if(sum==num)
			
			System.out.println("Perfect number");
		
		else
			System.out.println("Not a Perfect number");

	}

}
