package InheritanceDemo;

public class ChildClass3 extends BaseClass {

	public static void main(String[] args) {
		//Scenario 3: Base class reference and child class object - This will allow to access all the methods of base class only and not child class method 
		
		BaseClass obj1 = new ChildClass3();
		
		obj1.add();
		obj1.sub();
		//obj1.mul();
		//obj1.div();
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
