package javaStringProgram;

public class StringcaseConversion {
	public static void main(String[] args)
	{
		
		String str="You are Buffalo";
		String temp="";
		
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				int x=ch;
				
				x=x+32;          //conversion
     			ch=(char)x;
			}
			temp=temp+ch;		//concatenation		
		}
		
		System.out.println(temp);
		
		}
}