package ClassDemo;

public class FirstClassDemo {
	
	int x=90;
	int y=100;

	public static void main(String[] args) 
	{
		
		System.out.println("Program started");
		FirstClassDemo obj1=new FirstClassDemo();
		
		obj1.sum();
		
		System.out.println("Value of X is "+obj1.x);
		System.out.println("Value of Y is "+obj1.y);
		
		System.out.println("End Program");
	
	}
	
	public void sum()
	{
	int a=60;
	int b=100;
	int c = b+a;
	
	System.out.println("Sum of 2 numbers is "+c);
		
	}

}
