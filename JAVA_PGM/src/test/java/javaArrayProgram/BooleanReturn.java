package javaArrayProgram;

public class BooleanReturn

{ static int arr[]= {10,20,30,40,50};
static int key=30;

	public static void main(String[] args)
{
	System.out.println(check(key));
}


public static boolean check(int m)
{ boolean flag=false;
	for(int i=0;i<arr.length;i++)
	{
		if(key==arr[i])
		{	flag=true;
		break;
	}
	}
	return flag;
}
}
