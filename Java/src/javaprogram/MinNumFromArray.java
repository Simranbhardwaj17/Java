package javaprogram;

public class MinNumFromArray {

	public static void main(String[] args) {
		
		int numbers[] = {5, 7, 56, 34, 22, -1, 0, -9};
		
		int minNum = Integer.MAX_VALUE;
				
		for (int number: numbers) {
			if (number < minNum) {
				minNum = number;
			}
		}
		
		System.out.println("Minimun num is: " + minNum);

	}

}
