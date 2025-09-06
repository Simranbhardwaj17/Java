package t06_methods;

public class MathMethods {
	
	public static int minimum() {
		int a = 4;
		int b = 6;
		return a<b ? a : b;
	}
	
	public static int minimum2() {
		int a = 7;
		int b = 6;
		if (a<b) {
			return a;
		} else {
			return b;
		}
	}
	
	//using math fn
	public static void minimum3() {
		int a = -68;
		int b = 68;
		System.out.println("Minimum number is: " + Math.min(a, b));
	}
	
	public static void mathFunctions() {
		int x = -8;
		int y = 8;
		System.out.println("Square root of y is: " + Math.sqrt(y));
		System.out.println("Square root of the number is: " + Math.sqrt(4));
		System.out.println("Absolute val of the number is: " + Math.abs(x));
		System.out.println("Random val is: " + Math.random() * 6);  //only b/w 0 & 1 (mul by 6 to get no b/w 1 to 6)
	}
	
	public static int getRandom() {
		return (int) (Math.random() * 6) + 1;
	}
	
	public static int getRandomByFormula(int s, int c) {
		return (int) (Math.random() * (c-s+1) + s);
	}

	public static void main(String[] args) {
		
		System.out.println("Minimum number is: " + minimum());
		System.out.println("Minimum number is: " + minimum2());
		minimum3();
		mathFunctions();
		System.out.println("Random value b/w 1 to 6 is: " + getRandom());
		System.out.println("Random value b/w given number: " + getRandomByFormula(10, 15));
	}

}
