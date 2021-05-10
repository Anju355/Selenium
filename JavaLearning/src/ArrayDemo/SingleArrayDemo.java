package ArrayDemo;

public class SingleArrayDemo {

	public static void main(String[] args) {
		//Array = 20 bytes of memory, 1 dimensional array
		
		int student_Id[]= new int[5];
		
		student_Id[0] = 50;
		student_Id[1] = 55;
		student_Id[2] = 65;
		student_Id[3] = 75;
		student_Id[4] = 93;
		
		int sizeofArray = student_Id.length;
		
		System.out.println("Length of the array is "+sizeofArray);
		
		//for (int i=0;i<sizeofArray;i++)
		//{
		//	System.out.println("Student id is "+student_Id[i]);
		//}
		int i = 0;
		while(i<sizeofArray)
		{
			System.out.println("Student Id is "+student_Id[i]);
			i++;
		}
		
		}

}
