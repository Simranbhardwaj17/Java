package javabasics;

public class DataTypes {

	public static void main(String[] args) {
		
		//Primitive Types - fixed memory
		
		//byte - 1 [-128 to 127]
		//short - 2
		//int - 4  1,2,3
		//long - 8   large int
		//float - 4  3.14
		//double - 8
		//char = 2  a, b,c
		//boolean - 1  T/F
		
		byte age = 30;
		int phone = 1234567890;
		long phone2 = 12345678900L; //L is used to show long type value
		float pi = 3.14F;  //F to show float also u can use f but its better
		char letter = '@';
		boolean isAdult = false;
		
		
		//Non-Primitive Types - own fn/mthds to perform operations, can exceed memory
		              //declare by new keyword(it converts cls to obj)		
		String name  = "Any";
		System.out.println(name.length()); 
		
		String name1 = new String("Aish");
		String friend = new String("Au");
		System.out.println(name1.length()); 
	}

}
