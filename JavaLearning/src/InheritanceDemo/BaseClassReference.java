package InheritanceDemo;

public class BaseClassReference extends BaseClass {

	public static void main(String[] args) {
		//Scenario 2: Base class reference and Base Class object - This will allow to access all the methods of base class only 
		
		BaseClass obj1 = new BaseClass();
		
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
