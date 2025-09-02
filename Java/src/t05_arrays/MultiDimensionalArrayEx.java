package t05_arrays;

public class MultiDimensionalArrayEx {

	public static void main(String[] args) {
		
		//row - stud roll
		//col - stud subj position
		//marks - value stored
		
//		int marks[][] = new int[4][3];
		
//		//stud1 marks
//		marks[0][0] = 12;
//		marks[0][1] = 42;
//		marks[0][2] = 11;
//		
//		//stud2 marks
//		marks[1][0] = 32;
//		marks[1][1] = 41;
//		marks[1][2] = 10;
//		
//		//stud3 marks
//		marks[2][0] = 12;
//		marks[2][1] = 56;
//		marks[2][2] = 87;
//		
//		//stud4 marks
//		marks[3][0] = 87;
//		marks[3][1] = 91;
//		marks[3][2] = 56;
		
//		System.out.println(marks[0][0]);
		
		
		int marks[][] = {
				{98, 87, 89},
				{91, 96, 39},
				{45, 84, 86},
				{88, 77, 99}
		};
		
		System.out.println(marks[2][2]);

	}
	
	//To find address of index, add of zero + index * size - For 1D

}
