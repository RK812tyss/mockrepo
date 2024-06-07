package JAVA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class InterviewBasedQns
{

	@Test

	public void withDuplicate()
	{
		String str2="India";
		String str=str2.toLowerCase();
		int Vcount=0;
	
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				Vcount++;
			}
			
		
		}
		
		System.out.println(Vcount );
		
		
		
	}
	
	@Test

	public void withoutDuplicate()
	{
		String s="india";
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();// remove duplicates
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	
	int count=0;
	for(Character ch:set)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
			System.out.println(ch);
		}
		
	}
	System.out.println(set);
	
	System.out.println(count);
	}
	
	@Test

	public void extractAndFindSum()  //o/p:7
	{
		String s="a2b4c1";       
		char[] c=s.toCharArray();
		int sum=0;
		for( char ch:c)
		{
			
			
			if(ch>'0'&& ch<'9')
			{ 
				int n=ch-48;
				sum=sum+n;
			}
			
		}
		System.out.print(sum);
		
		
	}
	
	@Test

	public void separateAndPrint() 
	{
		String s="a2b&3d%5";
		String alpha="";
		String num="";
		String spec="";
		
		for( int i=0;i<s.length();i++)
		{
			
			
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{ 
				alpha=alpha+s.charAt(i);
			}
			else if (s.charAt(i)>='a'&&s.charAt(i)<'z') 
			{
				num=num+s.charAt(i);
			}
			
			else
			{
				spec=spec+s.charAt(i);
			}
		}
		System.out.print(alpha+num+spec);
		
	}
	
	@Test

	public void StringPattern() //o/p:a3b3c1
	{
		String s="aabbabc";
		char[] a=s.toCharArray();
		HashMap<Character,Integer> map = new HashMap <Character,Integer>();
		
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
		for(Entry<Character, Integer> m:map.entrySet())
		{
			
			
				System.out.print(m.getKey()+"" +m.getValue());
			
		}
		
	}
	
	@Test

	public void StringPattern2() //o/p:a2b2a1b1c1
	{
		
	String s="aabbabc";
	int count=1;
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i)==s.charAt(i+1))
		{
			count++;
		}
		else
		{
			System.out.print(s.charAt(i)+""+count);
			count=1;
		}
	}
	System.out.print(s.charAt(s.length()-1)+""+count);
	
	}
	

	@Test

	public void StringPattern3() //5
	{
		
		String s="In d ia";
		
		String ss = s.replace(" ","");
		
		int count=0;
		
		for(int i=0;i<ss.length();i++)
		{
			count++;
		}
		System.out.println(count);
	}
	
	
	@Test

	public void StringPattern4()  //6789 5 45 1234
	{
		
		String str="abc1234bd45cf5gh6789";
		
		String[] s = str.split("[^0-9]" ); //not consider alphabets
		
		 for(int i=s.length-1;i>=0;i--)
		 {
			 System.out.print(s[i]+" ");
		 }
	
	}
	
	@Test

	public void StringPattern5() //bangalore welcome to hi
	{
		String s="hi welcome to bangalore";
				
		String[] str = s.split(" ");
		
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	
		}
	
	
	@Test

	public void StringPattern6() //9&ol$l%eh
	{
	
	String s="h&el$l%o9";
	
	  String s1 = s.replaceAll("[^A-Za-z0-9]","");
	  System.out.println(s1);
	  int c=s1.length()-1;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='a' && s.charAt(i)<='z'||s.charAt(i)>='0'&& s.charAt(i)<='9')
		{
			System.out.print(s1.charAt(c--));
		}
		else
		{
			System.out.print(s.charAt(i));
		}
	}
	
	
	}
	
	@Test

	public void StringPattern7() 
	{
		String s="hello";
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("_");
			}
		}
	
	}
	
	
	
	@Test

	public void AscendingOrderBubblesort()
	{
		int[] arr= {5,3,0,4,1};
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
//					arr[i]=arr[i]+arr[j];
//					arr[j]=arr[i]-arr[j];
//					arr[i]=arr[i]-arr[j];
					break;
				}
				
			}
			System.out.print(arr[i] +" ");
			
		}
		
		//System.out.println(Arrays.toString(arr));
			
	
	}
	
	
	@Test

	public void DescendingOrderBubblesort()
	{
		int[] arr= {5,3,0,4,1};
		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
//					arr[i]=arr[i]+arr[j];
//					arr[j]=arr[i]-arr[j];
//					arr[i]=arr[i]-arr[j];
				}
				
			}
			System.out.print(arr[i]);
		}
		//System.out.println(Arrays.toString(arr));
			
	}
	
	@Test

	public void qn2() //sum of 1st 3 min no in array
	{
		int[] arr= {5,3,10,4,1};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j] )
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
//					arr[i]=arr[i]+arr[j];
//					arr[j]=arr[i]-arr[j];
//					arr[i]=arr[i]-arr[j];
				}
				
			}
			
			
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.print("sum of min 1st 3 "+" "+sum);
	}
	
	@Test

	public void qn4()//product of 1st 3 min no. 
	{
    int[] arr= {5,3,10,4,1};
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j] )
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}
				
			}
			
			}
		int product=1;	
		
		for(int i=0;i<3;i++)
		{
			product=product*arr[i];
		}
		
		System.out.print("product of min 1st 3 "+" "+product);
		
	}
	
	@Test

	public void qn6()// first min no.using bubble sort
	{
	
		int[] arr= {5,3,10,4,1};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j] )
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}
				
			}
			
			}
		System.out.println(arr[0]);
		
	}
	
	@Test

	public void qn8()  //first min without using bubble sort
	{

		int[] arr= {5,3,10,4,1};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{

			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println(min);
	}
	
	@Test

	public void qn9() 
	{
		int[] arr= {5,3,10,4,1};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{

			if(arr[i]>max)
				max=arr[i];
		}
		
		System.out.println(max);
	}
	
	@Test

	public void qn10()//find frequency of particular element having max count
	{
		int a[]= {3,1,2,1,5,2,1};
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
		int max=0;
		
		for(Entry<Integer, Integer> map:m.entrySet())
		{
			if(map.getValue()>max)
				
			{
				max=map.getValue();
				System.out.println(map.getKey()+"="+max );
			}
		}
	}
	
	@Test

	public void secondMaxEle()
	{
		int[] a= {2,3,5,7,9};
		
		int max=0;
		int secMax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secMax=max;
				max=a[i];
			}
		}
		System.out.println(secMax);
	
	}
	
	@Test

	public void secmin()//later
	{
   int[] a= {10,2,3,5,7,9};
		
		int min=a[0];
		int secMin=Integer.MAX_VALUE;
		System.out.println(secMin);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secMin=min;
				min=a[i];
				
			}
			if(secMin>a[i] && min<a[i] ) 
			{
				secMin=a[i];
			}
		}
		System.out.println(secMin);
		
		
		
	}
	
	@Test

	public void qn()
	{
		int[] a= {7,4,3,4,2,6,5,5,8};
		
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
				sum=sum+(a[i]+a[j]+a[k]);
				if(sum==10)
				{
					count++;
					System.out.println(count);
				}
				}
				
			}
			
			
		}
				
	}
	
	
}
	
