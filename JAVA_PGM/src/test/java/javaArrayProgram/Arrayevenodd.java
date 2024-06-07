package javaArrayProgram;

public class Arrayevenodd 
{
public static void main(String[] args)
{
	int arr[]= {10,21,30,47,50};
	int evencount=0,oddcount=0;
	int evensum=0,oddsum=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
			{evencount++;
		evensum=evensum+arr[i];
			}
		else
		{		oddcount++;
		oddsum=oddsum+arr[i];
		}
	}
	System.out.println(evensum + "\t"+ evencount );
	
	System.out.println(oddsum +"\t"+ oddcount);
	
	
}
}
