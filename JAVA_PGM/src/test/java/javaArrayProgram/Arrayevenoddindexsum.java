package javaArrayProgram;

public class Arrayevenoddindexsum
{
	public static void main(String[] args)
	{
		int arr[]= {10,21,30,47,50};
		int evenindsum=0,oddindsum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
		evenindsum=evenindsum+arr[i];
		
			else
				oddindsum=oddindsum+arr[i];
		}

		System.out.println("even index sum = "+evenindsum);
		System.out.println("odd index sum = "+oddindsum);
}
}