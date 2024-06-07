package JAVA;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;
public class mock
{

	@Test
	 public void qn1()
	 {
		String s="bAngalore";
		s = s.toLowerCase();
		int vcount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)== 'i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vcount++;
			}
		}
		System.out.println(vcount);
	 }
	
	
	
	@Test
	 public void qn2()
	 {
		String s="Hello";
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
			for(int j=0;j<=i;j++)
			{
				if(i<s.length()-1)
				{
				System.out.print("_");
				}
			}
		}
		
		
	 }
	
	@Test
	 public void qn3()
	 {
		String s="Bang a lore";
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
				
		
		
	 }
	
		@Test
		public void qn4()
		{
			String s = "modi";

			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					System.out.print(s.charAt(i));
				} else {

					String str = "";
					str = str + s.charAt(i);
					System.out.print(str.toUpperCase());
				}
			}

		}

		@Test
		public void qn5()       //prv
		{
			String s = "Apoorva";

			HashMap<Character,Integer> m= new HashMap<Character,Integer>();
	    	for(int i = 0; i < s.length(); i++)			
			{
				if(m.containsKey(s.charAt(i)))
				{
					m.put(s.charAt(i),m.get(s.charAt(i))+1);
				}
				else
				{
					m.put(s.charAt(i), 1);
				}
			}
	    	
	    	
	    	for(Entry<Character, Integer> map : m.entrySet())
	    	{
	    		if(map.getValue()==1)
				{
					System.out.print(map.getKey());
				}
	    	}
		}
		
}




