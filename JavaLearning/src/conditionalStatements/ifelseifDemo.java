package conditionalStatements;

public class ifelseifDemo {
	public static void main(String args[]) {
		
		String browser = "NewBrowser";
				
				if (browser.equalsIgnoreCase("Chrome"))
				{
					System.out.println("TC executed in Chrome");
				}
				else if (browser.equalsIgnoreCase("Firefox"))
				{
					System.out.println("TC executed in Firefox");
				}
				else if (browser.equalsIgnoreCase("IE"))
				{
					System.out.println("TC executed in IE");
				}
				else
				{
					System.out.println("Please provide valid browser name");
				}		
	}
}
