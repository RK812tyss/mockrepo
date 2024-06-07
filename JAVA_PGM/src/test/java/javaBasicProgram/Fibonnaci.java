package javaBasicProgram;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) 
	{
		int f=1;
		int s=2;		
		int count=10;
		System.out.println(f+"\n"+s);
		for(int i=3;i<=count;i++)
		{
			int t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}
		
		
		
		
	}

}
