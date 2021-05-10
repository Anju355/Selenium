package ArrayDemo;

public class SingleArrayDemo2 {

	public static void main(String[] args) {
		//Array = 20 bytes of memory
		
		int student_Id[]= new int[5];
		
		student_Id[0] = 50;
		student_Id[1] = 55;
		student_Id[2] = 65;
		student_Id[3] = 75;
		student_Id[4] = 93;
		
		System.out.println("Student Id is "+student_Id[3]);
	}

}
