package CompilePolyMorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
		//Polymorphism - Compile time binding(Early binding) - Same methods with different signuatues
		
		CompileDemo1 obj1 = new CompileDemo1();
		
		obj1.add(40.30, 40);
		obj1.add(15, 15.55);
		obj1.add(50.55, 30.66);
		obj1.add(45, 35);
		obj1.add(34, 34, 24);

	}
	
	//Only order of the argument is changed, method, type of argument all are same
	public void add(double a, int b)
	{
		double sum = a+b;
		System.out.println("Sum of the number is "+sum);
	}
		
	//Order of Argument with same method (Add)
	public void add(int a, double b)
	
	{
		double sum = a+b;
		System.out.println("Sum of number is "+sum);
	}	
	
	//Type of Argument is different with same method
	public void add(double a, double b)
	{
		double c=a+b;
		System.out.println("Sum of number is "+c);
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
			System.out.println("sum of number is "+c);
	}
	
	//changing the number of argument so java will not throw error for the same method
	public void add(int a, int b, int d)
	{
		int c=a+b+d;
		System.out.println("sum of number is "+c);
	}

}
