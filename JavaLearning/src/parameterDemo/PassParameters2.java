package parameterDemo;

public class PassParameters2 {
	

	public static void main(String[] args) {
		
		//Calling the Dynamic calculator methods from other class
		DynamicCalculator obj1 = new DynamicCalculator();
		int sum = obj1.add(450, 340);
		System.out.println("sum result is "+sum);
		
		double sub = obj1.sub(789.65, 56);
		System.out.println("Subtraction result is "+sub);
		
		String fullName = DynamicCalculator.getMyFullName("Muhammad Anjum", "Latif");
		System.out.println("Congrats "+fullName);

	}
	
}
