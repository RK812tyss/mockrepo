package JAVA_Assignment;

import org.testng.annotations.Test;

public class pattern 
{
@Test

public void pattern1()
{   int row=4;
	
	int num=0;
	for(int r=1;r<=row;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print(++num +" ");
		}
		System.out.println();
	}
	
}

@Test
 void pattern2()
{   int row=4;
	
	
	for(int r=1;r<=row;r++)
	{
		int num=1;	
		for(int c=1;c<=r;c++)
		{
			System.out.print(num++ +" ");
		}
		System.out.println();
	}
}
	
@Test
void pattern3()
	
{
	int row=5;
	for(int r=1;r<=row;r++)
	{
		for(int c=1;c<=row-r;c++)
		{
			System.out.print(" ");
		}
		int num=1;
		for(int s=1;s<=r;s++)
		{
			
			System.out.print(num++);
		}
		int num2=num-2;
		for(int w=1;w<=r-1;w++)
	{
			System.out.print(num2--);	
			
	}
	
		System.out.println();
	}
	

}


@Test
void pattern4()
{
	int row=5;
	for(int r=1;r<=row;r++)
	{
		for(int c=1;c<=row-r;c++)
		{
			System.out.print(" ");
		}
		
		int num=1;
		for(int w=1;w<=r-1/2;w++)
		{
			System.out.print(num++);
			int num2=num-2;
			System.out.print(num2--);
		}
		
		System.out.println();
	}
	
	
}
}
