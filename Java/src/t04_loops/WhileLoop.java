package t04_loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// 
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		
		Scanner sc = new Scanner(System.in);
		boolean hasLearnt = false;
		
		while(!hasLearnt) {
			System.out.println("Went to school, tried to learn");
			System.out.print("Have you understood? ");
			hasLearnt = sc.nextBoolean();
		}
		System.out.println("Now learn");

	}

}
