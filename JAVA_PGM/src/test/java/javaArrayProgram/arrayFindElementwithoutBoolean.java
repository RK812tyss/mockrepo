package javaArrayProgram;

public class arrayFindElementwithoutBoolean {

	public static void main(String[] args)
	{
		int arr[]= {10,30,40,50};
		
		int key=50;
		
		for(int i=0;i<arr.length;i++)
		{
		if(key==arr[i])
		{	
		
		System.out.println("key found");
		break;
		}
		
		else
			
			continue;
			
	}

}
}