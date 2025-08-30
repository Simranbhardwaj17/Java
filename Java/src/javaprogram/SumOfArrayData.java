package javaprogram;

public class SumOfArrayData {

	public static void main(String[] args) {
		// 
		int elements[] = {20, 45, 60, 35, 20};
		
		int sum = 0;
		
		//ForEach loop
//		for(int element: elements) {
//			sum += element;
//		}
		
		//for loop
		for(int i=0; i < elements.length; i++) {
			sum += elements[i];
		}
		System.out.println("Sum is: " + sum);

	}

}
