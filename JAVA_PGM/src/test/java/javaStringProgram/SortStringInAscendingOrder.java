package javaStringProgram;

import java.util.Arrays;

public class SortStringInAscendingOrder {
static	String str="rahulkumarpandey";
static	char[] ch= str.toCharArray();

	public static void main(String[] args)
	{
				//System.out.println(ch);
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
			
			if(ch[i]>ch[j]) 
			{	
				swap(i,j);
			}
				
			}
		}
		System.out.println(ch);
		System.out.println(Arrays.toString(ch));

	}
	
	public static void swap(int i,int j)
	{
		ch[i]=(char) (ch[i]+ch[j]);
		ch[j]=(char) (ch[i]-ch[j]);
		ch[i]=(char) (ch[i]-ch[j]);
	}

}
