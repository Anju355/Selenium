package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String actuals = "Welcome to Selenium World";
		String expected = "welcome to Selenium World";
		
		boolean status = actuals.equals(expected);
		System.out.println("Status is "+status);
		
		boolean status1 = actuals.equalsIgnoreCase(expected);
		System.out.println("Status is "+status1);

	}

}
