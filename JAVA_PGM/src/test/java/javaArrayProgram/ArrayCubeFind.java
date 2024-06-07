package javaArrayProgram;

public class ArrayCubeFind {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int cube[]=new int[arr.length];//empty array of size equal to arr[]
		
		for(int i=0;i<arr.length;i++)
		{
           
			 //cube[i]= arr[i]*arr[i]*arr[i];
			 System.out.println("cube of "+ arr[i]+ " = " + (cube[i]= arr[i]*arr[i]*arr[i]));
       	
		}
		
		
}
}