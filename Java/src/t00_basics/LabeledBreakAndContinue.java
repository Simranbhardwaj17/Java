package t00_basics;

public class LabeledBreakAndContinue {

	public static void main(String[] args) {
		
		// Not used mostly
		// To break from labeled loop, need to label the loop, to tell which loop to exit
		//Syn:
//		OL1:
//			OL2:
//				OL3:
//					OL4: 
//					{
//			         break OL2;
//					}
//		..
//	    }	 here, only OL1 content will run coz of LabeledBreak of 2nd	
		
		
		//use for while loop to print:-   1 2 3   Printed: 1 times (till 10 times)
		for (int z = 1; z <= 10; z++) {
        	int b = 1;
        	while (b <= 5) {
        		if (b == 4) break;
        		System.out.print(b + " ");
        		b++;
        	}
        	System.out.println("  Printed: " + z + " times");
        }   
		
		
		//Here, we use labeled break to get out of all loop
		//use for while loop to print:-   1 2 3   
		outerLoop:
		for (int z = 1; z <= 10; z++) {
        	int b = 1;
        	while (b <= 5) {
        		if (b == 4) break outerLoop;
        		System.out.print(b + " ");
        		b++;
        	}
        	System.out.println("  Printed: " + z + " times");
        }  
	}

}
