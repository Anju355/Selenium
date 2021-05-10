package stringDemo;

public class StringDemo5 {

	public static void main(String[] args) {
		//Trim, Replace,CharAt
		
		String name = "     Halifax     Toronto  ";
		String name1 = name.trim();
		String name2 = name.replace("Halifax", "Okara");
	
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name2.charAt(17));

	}

}
