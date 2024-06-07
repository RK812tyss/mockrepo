package javaArrayProgram;

public class ArrayFirstLastFind {

	public static void main(String[] args)
	{
		int arr[]= {18,21,10,47,58};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{

			sum=arr[0]+arr[arr.length-1];
		}	
			System.out.println(sum);
			
	

}
}