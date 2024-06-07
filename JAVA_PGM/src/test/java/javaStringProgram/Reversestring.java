package javaStringProgram;

public class Reversestring {
	static	String str="rahulkumarpandey";
	

	public static void main(String[] args)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
