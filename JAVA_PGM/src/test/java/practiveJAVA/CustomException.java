package practiveJAVA;

import java.nio.channels.InterruptedByTimeoutException;

public class CustomException extends Exception
{ 
	

	static String passName="rahul";
	CustomException(String s)
	{
		System.out.println(s);
		
	}
}
