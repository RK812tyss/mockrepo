package JAVA;

import org.testng.annotations.Test;

public class Interview2Qns 
{
	@Test

	public void qn1() //find frequency of a number having max count without hashmap o/p:1=2
	{
		int[] a= {3,1,2,1,5};
		int max=0;
		int val=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				val=a[i];
			}
		}
		System.out.println(val +"="+max);
	}
	
	
	@Test

	public void qn2() //add o/p:{5, 9,4,6,3}
	{
		int[] a= {2,5,1,4,3};
		int[] b= {3,4,3,2};
		
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			try {
				System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e)
			{
				if(a.length<b.length)
				{
					System.out.print(b[i]);
				}
				else
				{
					System.out.print(a[i]);
				}
			}
		}

	}
	
	@Test

	public void qn3()
	{
		String s="a2b2a1b1b5c5";
		char[] str = s.toCharArray();
		for(int i=1;i<=str.length;i=i+2) 
		{ int count=str[i];
		count=count-48;
			for(int j=1;j<=count;j++) {
			System.out.print(str[i-1]);
			}	
		}
	}
}
