package InheritanceDemo;

public class ChildClass extends BaseClass {

	public static void main(String[] args) {
		// Scenario1 - Child Class Reference and Child Class Object - This will allow to access all the methods of base class and child class
		
		ChildClass obj1 = new ChildClass();
		
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		

	}
	
	public void mul()
	{
		System.out.println("Hey I am in Child class and multiplication is 2500");
	}
	
	public void div()
	{
		System.out.println("Hey I am in Child class and division is 50");
	}

}
