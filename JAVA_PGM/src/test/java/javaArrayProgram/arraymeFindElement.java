package javaArrayProgram;

public class arraymeFindElement 
{ //static boolean flag;
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};
		boolean flag=false;
		int key=30;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{	flag=true;
			break;
		}
		}
		if(flag==true)
	System.out.println("element found "+key);	
		else
			System.out.println("not found");
		
		}
		
}