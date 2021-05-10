package stringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String actual = "Welcome to Selenium Webdriver world";
		String expected = "Selenium";
		
		boolean status = actual.contains(expected);
		System.out.println("Status is "+status);
		
		boolean status1 = actual.contentEquals(expected);
		System.out.println("Status is "+status1);

	}

}
