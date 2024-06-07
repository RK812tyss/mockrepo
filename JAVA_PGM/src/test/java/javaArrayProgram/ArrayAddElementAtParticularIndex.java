package javaArrayProgram;

public class ArrayAddElementAtParticularIndex {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int num=10;
		int index=5;
		int newarr[]= new int[arr.length+1];
		for(int i=0;i<index;i++)
		{	
						newarr[i]=arr[i];
		}
		
		for(int i=index;i<arr.length;i++)
		{
			
			newarr[i+1]=arr[i];
		}
		newarr[index]=num;
		
			
	
							
		for(int i=0;i<arr.length+1;i++)
		{
			
			System.out.println(newarr[i]);
		
		}
		
		
		
	}
	
	

}
