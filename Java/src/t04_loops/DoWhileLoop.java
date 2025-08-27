package t04_loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		// 
		int j = 8;
		while (j <= 5) {
			System.out.println(j);
			j++;
		}
		
		
		do {
			System.out.println(j);  //one time print 8
			j++;
		} while (j <= 5);
	

		int i = 7;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		
		System.out.println("Will be printed");

	}

}
