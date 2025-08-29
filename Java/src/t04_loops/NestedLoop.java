package t04_loops;

public class NestedLoop {

	public static void main(String[] args) {
		//1 time outer then a/c to condi inner then next line(out of loop), then outer inc then go to inner
		
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
        
		// * square print
        for (int m = 1; m <= 5; m++) {
        	for (int j = 0; j <= 5; j++) {
            	System.out.print("* ");
            }
        	System.out.println();
        }    
		
		
		// * rectangle print
        for (int s = 1; s <= 3; s++) {
        	for (int c = 0; c <= 5; c++) {
            	System.out.print("* ");
            }
        	System.out.println();
        }   
        
        
        //print 1 to 5 - 10times & see how many times (30)
        for (int count = 1; count < 6; count++) {
        	for (int a = 0; a <= 5; a++) {
            	System.out.print(a + " ");
            }
        	System.out.println("  Printed count is: " + count);
        }   
        
        //right triangle pattern
        for (int d = 0; d < 8; d++) {
        	for (int g = 0; g <= d; g++) {
        		System.out.print(g);
        		System.out.print("* ");
        	}
        	System.out.println();
        }
         
        //right triangle pattern(print 1- 1 time, 2 - 2 times,...till 7)
        for (int t = 0; t < 8; t++) {
        	for (int y = 0; y < t; y++) {
        		System.out.print(t + " ");
        	}
        	System.out.println();
        }
        
        
        // use for loop
        for (int z = 1; z <= 10; z++) {
        	for (int b = 1; b <= 5; b++) {
            	System.out.print(b+ " ");
            }
        	System.out.println("  Printed: " + z + " times");
        }   
        
        // use while loop for above
        for (int z = 1; z <= 10; z++) {
        	int b = 1;
        	while (b <= 5) {
        		System.out.print(b + " ");
        		b++;
        	}
        	System.out.println("  Printed: " + z + " times");
        }   

	}
	
}
