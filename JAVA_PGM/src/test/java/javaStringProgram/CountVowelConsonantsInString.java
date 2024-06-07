package javaStringProgram;

public class CountVowelConsonantsInString {

	public static void main(String[] args) 
	{
		
		String str="myname";
		int Vcount=0;
		int Ccount=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				Vcount++;
			}
			
			else
				Ccount++;
			
		}
		
		System.out.println(Vcount + "\n\t"+ Ccount);
		
		
		
	}

}
