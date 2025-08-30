package t04_loops;

public class ForEachLoop {

	public static void main(String[] args) {
		
        String names[] = {"SB", "SS", "SK", "AK", "CC"};		
		
		for (String name: names) {   //read as for each name in names
			System.out.println("Name is: " + name);
 		}
		
		
        int elements[] = {20, 45, 60, 35, 20};
		
		int sum = 0;
		for(int element: elements) {
			sum += element;
		}
		System.out.println("Sum is: " + sum);

	}

}
