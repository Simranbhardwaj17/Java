package t03_conditional_statements;

import java.util.Scanner;

public class If_ElseIf_Else {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day with first letter uppercase");
		System.out.print("Enter day: ");
		String day = sc.nextLine();
		
		if(day.equals("Sunday") || day.equals("Saturday")) {
			System.out.println("Home day");
			System.out.println("Enjoy your day! ");
		}
		else if (day.equals("Monday") || day.equals("Tuesday") ||  day.equals("Wednesday"))
		    System.out.println("Physics");
		else if (day.equals("Thursday") || day.equals("Friday"))
			System.out.println("Math");
		else 
			System.out.println("Enter valid day");
		System.out.println("Have a nice day");
	}

}
