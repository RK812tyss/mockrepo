package javaArrayProgram;

public class ArrayFindDuplicate {

	public static void main(String[] args) 
	{
		int[] arr= {6,5,6,5,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
