package t05_arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		// Arrays r stored in contiguous memory [consecutive mem location]
		//same DT
		//Arr is of fix/static size, can't change them , to inc size make new arr copy data of prev and add next data...
		
		//Decl
//		int intArray[];
//		     or
//		int[] intArray;
		
		//Allocate mem to arr
//		intArray = new int[30];
		
		int ages[] = new int[5];
		
		ages[0] = 4;
		ages[2] = 3;
		
		System.out.println(ages[0]);
		System.out.println(ages[1]); //by deft int store 0 
		System.out.println(ages[2]);
		System.out.println(ages[3]);
		
		System.out.println("Length of age var is: " + ages.length);

		//To get address of a specified index, [add of zero + index * size]
		
		
		//Initialize var
		int marks[] = {96, 98, 54, 78, 87};
		System.out.println(marks[3]);
		
		
		String names[] = {"SB", "SS", "SK", "AK", "CC"};
		
		//to iterate through arr
//		for (int i = 0; i < names.length; i++) {
//			System.out.println("Name is: " + names[i]);
		
		//ForEach loop
		for (String name: names) {   //read as for each name in names
			System.out.println("name is: " + name);
 		}
		
	}
	
}
