package javabasics;

public class BreakAndContinue {

	public static void main(String[] args) {
		//Jump statements
		
		// Break - When a break statement is encountered then the control is exited from the loop construct immediately.
		//use true for running code infinite times
		int i=0;
		while(true) {  //infinite times
			System.out.println(i);
			i = i + 1;
			if(i > 5) {
				break;
			}
		}
		
		
		// Continue - When the continue statement is encountered then 
		//the control automatically passed to the beginning of the loop statement.
		
		int j=0;
		while(true) {  //infinite times
			if(j == 3) { //skip 3
				j = j + 1;  //inc to skip finite loop
				continue;
			}
			System.out.println(j);
			j = j + 1;
			if(j > 5) {
				break;
			}
			
//			🚨 If you remove j = j + 1; from inside the if(j == 3) block:
//				Here’s what happens:
//				j = 3
//				if(j == 3) → true
//				continue; is executed before incrementing j
//				Loop jumps back → j is still 3
//				Again if(j == 3) → true → continue
//				🔁 Infinite loop on j == 3 — because j is never incremented!
			
//			✅ That’s why you need:
//			j = j + 1;  // So that j moves to 4 and doesn't get stuck at 3
//			continue;

		}

	}

}
