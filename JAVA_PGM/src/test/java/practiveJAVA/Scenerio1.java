package practiveJAVA;

import java.util.Scanner;

public class Scenerio1
{
	public static void main(String[] args) 
	{ String name;
		 Scanner sc=new Scanner(System.in);
		 while(true)
		 {
		 System.out.println("enter name");
		 
		  name=sc.nextLine();
		 
         
         if(name.equals(CustomException.passName))
         {
        	 System.out.println("no exception");
         }
         else
         { 
        	 try {
        	 throw new CustomException("exception occured");
        	 
         }
         
         catch(CustomException c)
         {
        	 System.out.println("exception HAndled");
         }
        	 
                
        	       	 
         }
         
                  
         
		 }
	}
}
