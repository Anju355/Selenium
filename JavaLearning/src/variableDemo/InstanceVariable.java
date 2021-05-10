package variableDemo;

public class InstanceVariable {
	
	int roll;
	double marks;

	public static void main(String[] args) {
		
		InstanceVariable obj1=new InstanceVariable();
		obj1.show();		

	}
	
	public void show()

	{
		System.out.println("Roll num " + roll + " "+"and marks are "+marks);
	}

}
