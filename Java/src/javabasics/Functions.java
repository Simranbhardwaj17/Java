package javabasics;

public class Functions {
	
	public static void printfan() {
		System.out.println("Aroma");
		System.out.println("Atomberg");
	}
	
	public static void printname(String name) {
		System.out.println(name);
	}
	
	public static void printsum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void printsum1(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	public static int returnsum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Methods
		//o/p type a/c to fn return type like int, string, float..
		printname("Simu");
		printname("Simi");
		printname("Ansh");
		
		printfan();
		
		printsum(10, 4);
		
		printsum1(1, 4);
		
		int sum = returnsum(2, 4);
		System.out.println(sum);
		
		System.out.println(returnsum(2, 6));
	}

}
