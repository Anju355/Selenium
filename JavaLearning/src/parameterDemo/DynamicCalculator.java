package parameterDemo;

public class DynamicCalculator {
	
	public static String getMyFullName(String firstName, String lastName)
	{
		String fullName = firstName+ " "+lastName;
		return fullName;
	}
	
	public int add(int a, int b)
	{
		int c=a+b;
		//System.out.println("Hey Result is "+c);
		return c;
	}
	
	public double sub(double x, double y)
	{
		double result=x-y;
		//System.out.println("Hey Sub result is "+result);
		return result;
	}


}
