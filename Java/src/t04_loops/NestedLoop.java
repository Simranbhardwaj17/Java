package t04_loops;

public class NestedLoop {

	public static void main(String[] args) {
		// 
        int rows = 3;
        int cols = 3;

        // Outer loop controls rows
        for (int i = 0; i < rows; i++) {
        	 System.out.println("s");
            // Inner loop controls columns
            for (int j = 0; j < cols; j++) {
                System.out.println("* "); // Prints an asterisk and a space
            }
            System.out.println(); // Moves to the next line after each row
        }

	}

}
