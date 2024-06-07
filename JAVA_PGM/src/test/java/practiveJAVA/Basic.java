package practiveJAVA;


interface A
{
	void work();
}

interface B
{
	void work();
}

public class Basic implements A,B
{
public static void main(String[] args) 
{
	Basic b=new Basic();
	b.work();
}
public void work()
{
	System.out.println("work");
}
}
