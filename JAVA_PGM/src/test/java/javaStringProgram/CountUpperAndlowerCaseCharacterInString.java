package javaStringProgram;

public class CountUpperAndlowerCaseCharacterInString {

	public static void main(String[] args) 
	{
		String str="TajMahal In Agra near Mathura";
		int uppercount=0;
		int lowercount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		
		if(ch>='a'&& ch<='z')
		{
			lowercount++;
			
		}
		
		else if(ch>='A'&&ch<='Z') // if there is no space then (else will work)
			
		uppercount++;
		
				
		
		}	
		
		System.out.println(uppercount + "\n\t"+ lowercount);
		
	}

}
