package practiveJAVA;

public class Abstraction
{
public static void main(String[] args)
{
	cup c=new coffee();
	cup t=new tea();
	c.drink();
	t.drink();
	cup.check();
}
}
class coffee implements cup
{
public	void drink()
	{
		System.out.println("drink coffee");
	}

}
class tea implements cup
{
	public	void drink()
	{
		System.out.println("drink tea");
	}
}
interface cup
{
	 void drink();
	 static void check()
	 {
		 System.out.println("check successful");
	 }
}


