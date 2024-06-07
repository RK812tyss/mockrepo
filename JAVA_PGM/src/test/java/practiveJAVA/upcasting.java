package practiveJAVA;

public class upcasting 
{
public static void main(String[] args) 
{
	animal a =new dog();
	dog d= (dog) a;
	a.sleep();
	d.run();
}
}
class animal
{
 void sleep()
	{
		System.out.println("animal");
	}
}
class dog extends animal
{
	void sleep()
	{   super.sleep();
		System.out.println("dog");
	}
	void run()
	{
		System.out.println("dog run");
	}
}