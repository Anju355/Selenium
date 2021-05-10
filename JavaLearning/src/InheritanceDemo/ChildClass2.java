package InheritanceDemo;

public class ChildClass2 extends BaseClass {

	public static void main(String[] args) {
		//Scenario 4: Child class refernece and Base class objec- This will be invalid scenario. Child can not hold parent 
		
		ChildClass obj1 = new BaseClass();
		
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
