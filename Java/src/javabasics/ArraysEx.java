package javabasics;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		// Arrays
		
		int phy = 30;
		int chem = 28;
		int bio = 25;
		
		int[] marks = new int[6];  //declare arr  (new for NP)
		marks[0] = 30;
		marks[1] = 28;
		marks[2] = 25; 
		//in single var "marks" store all
		
		System.out.println(marks[5]);
//		System.out.println(marks);  //don't use it
		
		
		//In C++, if not initialize var(var empty), var store garbage value
		//In java, it get initialize by null value or 0 or f for boolean
		
		boolean[] mark = new boolean[3];  //declare arr  (new for NP)
//		mark[0] = 30;
//		mark[1] = 28;
//		mark[2] = 25; 		
		System.out.println(mark[2]);
		
		
		//Arr properties:-  (not cld as fn() like str)
		//length
		System.out.println(marks.length);  //directly call  o/p: 6
		
		
		//sort
        //Arrays is arr class inside it a fn cld as .sort(), provide sorted arr
		//Class name should be in capital
		System.out.println(marks[0]); //30 before sorting
		Arrays.sort(marks);
		System.out.println(marks[0]);  //0 coz of uninitialized value as ( [6] not all r init) that come at time of sort
		
		
		//If already know ele inside arr, no need to use new keyword as str
		//1D arr
		int [] subj = {40, 50, 60};
		
		//2D arr
		int [][] result = {{30, 40, 50}, {33, 45, 56}};
		System.out.println(result[0][2]);	
		System.out.println(result[1][1]);
	}

}
