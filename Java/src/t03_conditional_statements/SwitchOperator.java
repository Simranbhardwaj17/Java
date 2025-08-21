package t03_conditional_statements;

import java.util.Scanner;

public class SwitchOperator {

	public static void main(String[] args) {
		
		// Optimized version of nestedIfElse
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day: ");
		int day = sc.nextInt();
		
		switch (day) {
			case 1:   //u may or maynot use block
				System.out.println("Mon");  
				break;
			
			case 2: {
				System.out.println("Tue");
				break;
			}
			case 3: case 4:  //can be in same line
				System.out.println("Wed");
				break;
		
//			case 4: {
//				System.out.println("Thurs");
//				break;
//			}
			case 5: {
				System.out.println("Fri");
				break;
			}
			case 6: {
				System.out.println("Sat");
				break;
			}
			case 7: {
				System.out.println("Sun");
				break;
			}
			default: 
				System.out.println("Invalid day!");
				System.out.println("Enter valid day(1 to 7)");
		}
	}

}