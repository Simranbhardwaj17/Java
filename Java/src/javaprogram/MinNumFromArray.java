package javaprogram;

public class MinNumFromArray {
	
	//Find minimum number from a array of number

	public static void main(String[] args) {
		
		int numbers[] = {5, 7, 56, 34, 22, -1, 0, -9};
		
		int minNum = Integer.MAX_VALUE;
			
		//using ForEach loop
		for (int number: numbers) {
			if (number < minNum) {
				minNum = number;
			}
		}
		
		//using For loop
		for (int i=0; i < numbers.length; i++) {
			if (minNum > numbers[i]) {
				minNum = numbers[i];
			}
			
		}
		
		System.out.println("Minimun num is: " + minNum);

	}

}
