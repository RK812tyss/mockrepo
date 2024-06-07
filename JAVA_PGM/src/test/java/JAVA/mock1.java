package JAVA;



public class mock1 implements A
{
	public static void main(String[] args) 
	{
		System.out.println(sum());
		System.out.println(sum(25,35));
		mock1 m=new mock1();
		m.move();
	}
	public static int sum()
	{
		return 0;
		
	}
	public static double sum(int a,int b)
	{
		return a+b;
		
	}
	
	public void move()
	{
		
		System.out.println("move");
	}
	
	
	
}
interface A
{
	void move();
	
	
}