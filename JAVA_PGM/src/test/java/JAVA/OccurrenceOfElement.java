package JAVA;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccurrenceOfElement 
{
@Test

public void occurrenceOfEle()
{
	
	int a[]= {1,3,1,3,4,5};
	HashMap<Integer, Integer> m = new HashMap <Integer,Integer>();
	for(int i=0;i<a.length;i++)
	{
		if(m.containsKey(a[i]))
		{
			m.put(a[i],m.get(a[i])+1);  //updating value of key
		}
				
		else
		{
			m.put(a[i], 1);
		}
	}
	System.out.println(m);
}
@Test

public void occurrenceOfEle2()
{	
	String s="kannada";
	char[] a=s.toCharArray();
	HashMap<Character,Integer> m = new HashMap <Character,Integer>();
	for(int i=0;i<a.length;i++)
	{
		if(m.containsKey(a[i]))
		{
			m.put(a[i],m.get(a[i])+1);
		}
				
		else
		{
			m.put(a[i], 1);
		}
	}
	System.out.println(m);
	
}
@Test

public void occurrenceOfEle3()
{	
	String str="i am am from bangalore";
	String[] s=str.split(" ");
	HashMap<String,Integer> m = new HashMap <String,Integer>();
	for(int i=0;i<s.length;i++)
	{
		if(m.containsKey(s[i]))
		{
			m.put(s[i],m.get(s[i])+1);
		}
				
		else
		{
			m.put(s[i], 1);
		}
	}
	System.out.println(m);
}	
	
	@Test

	public void onlyDuplicatewithCount()
	{	
	
	int[] a= {5,3,1,4,3,5};
	HashMap<Integer,Integer> map = new HashMap <Integer,Integer>();
		
	for(int i=0;i<a.length;i++)
	{
		if(map.containsKey(a[i]))
		{
			map.put(a[i],map.get(a[i])+1);
	     }
		
		else {
			map.put(a[i],1);
		}
	}
	for(Entry<Integer, Integer> m:map.entrySet())
	{
		if(m.getValue()>1)
		{
			System.out.println(m.getKey() +"-------> "+m.getValue());
		}
	}
	
		
}
	
	@Test

	public void onlyuniqueWithCount()
	{	
		int[] a= {5,3,1,4,3,5};
		HashMap<Integer,Integer> map = new HashMap <Integer,Integer>();
			
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i],map.get(a[i])+1);
		     }
			
			else {
				map.put(a[i],1);
			}
		}
		for(Entry<Integer, Integer> m:map.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println(m.getKey() +"-------> "+m.getValue());
			}
		}
		
		
	}
	
	
	
	
	
	
	
}

