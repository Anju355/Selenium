package InterfaceDemo;

public class AdvanceCal implements Calc {

	public static void main(String[] args) {
		// Child class reference and child class object - This will allow to access all the method of base class and child class
		
		AdvanceCal obj1 = new AdvanceCal();
		
		//x = 11;
		
		
		obj1.add();
		obj1.sub();
		obj1.CalculateSin();
		obj1.Calculatecos();

	}
	
	public void CalculateSin()
	{
		System.out.println("I am in Advance Calc CalculateSin method");
	}
	
	public void Calculatecos()
	{
		System.out.println("I am in Advance Calc Calculatecos method");	
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("I am in Calc Add method");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("I am in Calc sub method");
	}

}
