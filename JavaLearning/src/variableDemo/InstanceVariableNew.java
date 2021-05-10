package variableDemo;

public class InstanceVariableNew {
	
	int roll;
	double marks;
	
	public InstanceVariableNew (int roll, double marks)
	{
		this.roll=roll;
		this.marks=marks;
	}

	public static void main(String[] args) {
		
		InstanceVariableNew obj1=new InstanceVariableNew(1,70.50);
		obj1.show();		
		
		InstanceVariableNew obj2 = new InstanceVariableNew(2, 80.30);
		obj2.show();
		
		InstanceVariableNew obj3 = new InstanceVariableNew(3, 95.60);
		obj3.show();

	}
	
	public void show()

	{
		System.out.println("Roll num " + roll + " "+"and marks are "+marks);
	}

}
