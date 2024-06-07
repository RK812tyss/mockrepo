package JAVA;

import org.testng.annotations.Test;

public class JavaPractice
{

	@Test

	public void primeNumberRange_qn1()
	{
		for(int i=1;i<=100;i++)
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

	public void primenoCheck_qn2()
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
		if(count==2)
		{
			System.out.println(num+" "+"prime no");
		}
		else
			System.out.println("not a prime no");
	}
	
	

	
}
