package conditionalStatements;

public class ifElseDemo {
	
	public static void main(String args[]){
		
		System.out.println("Test started");
		String browser = "FireFox";
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Browser is "+browser);
		}
		else 
		{
			System.out.println("Browser is Firefox in the Else part");
		}
		
		System.out.println("Test End");
		
		
	}

}
