package stringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String fullname= "Selenium-HP-QTP-Testcomplete-Tosca";
		String []toolname=fullname.split("-");
		
		for(int i=0;i<toolname.length;i++)
			
		{
			System.out.println("Value for "+i+ " is "+toolname[i]);
						
//		if(toolname[i].equalsIgnoreCase("Test"))
			if (toolname[i].contains("Test"))
		{
			System.out.println("Passed");
			//break;
		}
	}

}
}
