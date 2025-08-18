package t02_operators;

public class AssignmentOp {

	public static void main(String[] args) {
		
		/*
		 
		a = b;
		a += b;   ->   a = a + b;
		a -= b;
		a *= b;
		a /= b;
		a %= b;
		
		*/
		
		int num1 = 2;
		int num2 = 4;
		System.out.println("First number is: " + num1);
		System.out.println("Second number is: " + num2);
		
		num1 *= num2;
		System.out.println("First number is: " + num1);
		System.out.println("Second number is: " + num2);
		
		int mul = num1 * num2;
		System.out.println("Multiplication is: " + mul);
		
		mul /= num1;  
		System.out.println("First number is: " + num1);
		System.out.println("Value of mul after divi by num1: " + mul);


//		int divi2 = num1 /= num2;  
//		System.out.println(divi2);  0
		
		System.out.println( num1 /= num2);
		System.out.println("Now first number become: " + num1);
	}

}
