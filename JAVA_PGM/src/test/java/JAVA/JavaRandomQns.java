package JAVA;

import java.util.Arrays;

import org.testng.annotations.Test;

public class JavaRandomQns
{@Test

	public void qn()
	{
		int[] a= {1,4,3,4,2,6,5,4,2};
		//Arrays.sort(a);
		
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
				if(a[i]+a[j]+a[k]==10)
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					count++;
				}
				}
			}
		}
		System.out.println(count);
	}


@Test

public void qn2()
{
	int[] a= {1,0,12,0,14,125,0,75,1};
	int[] b= new int[a.length];
	int index=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0) 
		{
			b[index++]=a[i];
		}
		
	}
	
	System.out.println(Arrays.toString(b));
}
}
