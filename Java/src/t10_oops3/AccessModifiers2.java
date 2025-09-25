package t10_oops3;

public class AccessModifiers2 {
	
	class College {
		
		int classNum = 10;
		int StudentNum;
		String facultyName;
		
	}

	//Solution 1: Create an outer class instance first

	public static void main(String[] args) {
		
		// Create an instance of the outer class
		AccessModifiers2 outer = new AccessModifiers2();
		
		// Use the outer class instance to create the inner class instance
		College clg = outer.new College();
		
		// You can now access the inner class's properties
		System.out.println("Class Number: " + clg.classNum);
	}
	
}
