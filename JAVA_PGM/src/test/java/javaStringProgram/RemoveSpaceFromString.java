package javaStringProgram;

public class RemoveSpaceFromString {

	public static void main(String[] args) 
	{
		String str="In d ia";
		String str1="";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{ 
				str1=str1+ch; 
				count++;
			}

	}

		System.out.println(count);
		
}
}