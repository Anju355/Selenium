package parameterDemo;

public class PassParameters {
	

	public static void main(String[] args) {
		
		PassParameters obj1 = new PassParameters();
		obj1.add(450, 340);
		
		obj1.sub(789.65, 56);

	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Hey Result is "+c);
		
	}
	
	public void sub(double x, double y)
	{
		double result=x-y;
		System.out.println("Hey Sub result is "+result);
	}

}
