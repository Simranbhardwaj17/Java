package t06_methods;

public class ComponentOfMethod {

	public static void main(String[] args) {
		
		//used to pass arg in main mthd (so to iterate the mthd)
		for(String arg: args) {
			System.out.println(arg);
		}
		
		//A method is a block of code or collection of statements or a set of grouped together
		//to perform a certain task or operation. It is used to achieve the reusaability of code.
		
		greet();
		int avg1 = average(5, 9, false);
		System.out.println("Avg of 1st is: " + avg1);
//		System.out.println("Avg is: " + average(13, 7));
		
		int doubleOfAvg = 2 * avg1;
		System.out.println("Double is: " + doubleOfAvg);
		
	}
	
	static void greet() {
		System.out.println("Hello");
	}
	
	static int average(int a, int b, boolean shouldAverage) {
		
		if (shouldAverage == false) {
			return -1;
		}
		int avg = (a+b)/2;
		System.out.println("Is it perform average? " + shouldAverage);
		return avg;    //so u cn use in main mthd         //it is the last s/t coz of return
//		System.out.println("Avg is: " + avg);   //not reachable
	} 

}
//When method call recursively, recursive stack created