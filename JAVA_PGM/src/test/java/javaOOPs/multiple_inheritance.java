package javaOOPs;


 interface A
 {void move();
 }
 
 interface B
 {
	public void move();
 }
 public class multiple_inheritance implements B,A
 {
	 
 
public void move()
{
	System.out.println("multiple inheritance"
			+ "");
	
}
public static void main(String[] args)
{
	multiple_inheritance m=new multiple_inheritance();
	m.move();
	
}
 }