package ArrayDemo;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		//2D Array example
		
		int school[][] = new int[2][3];
	
		school[0][0]=12;      //First row, first column
		school[0][1]=24;	  //First row, second column
		school[1][0]=36;	  //Second row, first column
		school[1][2]=48;	  //Second row, second column
		
		System.out.println(school[1][2]);
	}

}
