package practiveJAVA;

abstract class vehicle
{{System.out.println("upsc");}
int m;
vehicle(int m)
{
	this.m=m;
}


	abstract void start();
}


 class car extends vehicle
{car(int m) {
		super(m);
		
	}
{System.out.println("bpsc");}
	void drive()
	{
		System.out.println("car");
	}
	void start()
	{
		System.out.println("start");
		
	}
	
	
}

class bike extends car
{ bike(int m) {
		super(m);
		
	}
{System.out.println("ssc");}
   void start()
   {
   	System.out.println("starting");
   }
}

class abstract1 
{

	public static void main(String[] args)
	{
		vehicle c1= new car(0);//no matter what reference type is, control goes to parent class.
		car c2= new car(0);// we cannot create object for abstract class
		bike b=new bike(0);
		 b.start();
		
	}

}



