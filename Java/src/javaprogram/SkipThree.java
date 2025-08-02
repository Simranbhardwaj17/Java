package javaprogram;

public class SkipThree {

	public static void main(String[] args) {
		
		// Using for loop to skip number 3
		
		for(int i = 1; i <= 5; i++) {	
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		
		// Using do while loop to skip number 3
		int j = 1;
		do {
			if (j == 3) {
				j = j + 1;
				continue;
			}
			System.out.println(j);
			j = j + 1;		
		} while (j <= 5);


	}

}
