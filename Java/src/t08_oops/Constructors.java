package t08_oops;

public class Constructors {

	public static void main(String[] args) {
		
//		Constructors
//		1. Constructors are invoked implicitly when you instantiate objects.
//
//		2. The two rules for creating a constructor are:
//			a. The name of the constructor should be the same as the class.
//			b. A Java constructor must not have a return type.
//
//		3. If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time. The default constructor initializes instance variables with default values.
//
//		4. Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.
//
//		5. A constructor cannot be abstract or static or final.
//
//		6. A constructor can be overloaded but can not be overridden.

		Complex num1 = new Complex(4, 6);
		Complex num2 = new Complex(2, 9, 4);
		num1.printed();
		num2.printed();
	}

}

class Complex {
	int a, b, c;
	
	public Complex(int real, int imaginary) {
		a = real;
	    b = imaginary;
//	    c = 9;
	}
	
	public Complex(int real, int imaginary, int number) {
		a = real;
	    b = imaginary;
	    c = number;
	}
	
//	void print() {
//		System.out.println(a + " + " + b + "i");
//	}
	
	void printed() {
		System.out.println(a + " + " + b + "i" + " + " +  c);
	}
}
