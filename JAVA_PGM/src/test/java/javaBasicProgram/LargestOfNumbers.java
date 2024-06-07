package javaBasicProgram;

import java.util.Scanner;

public class LargestOfNumbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		System.out.println("enter the number");
		int y=sc.nextInt();
		System.out.println("enter the number");
		int z=sc.nextInt();
		
		System.out.println((x>y&&x>z)?"x is greater":(y>x&&y>z)?"y is greater":"z is greater");
	}

}
