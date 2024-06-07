package practiveJAVA;



public class mock 
{
public static void main(String[] args) 
{
	String s="WeLCoM@*e";
	char[] ch=s.toCharArray();
	int ucount=0;
	int lcount=0;
	int charcount=0;
	
	for(char c:ch)
	{
		if(c>='A'&& c<='Z')
		{
			ucount++;
		}
		
		else if(c>'a'&& c<'z')
		{
			lcount++;
		}
		else
		charcount++;	
	}
	System.out.println(ucount + " "+ lcount+" "+charcount);
}
}
