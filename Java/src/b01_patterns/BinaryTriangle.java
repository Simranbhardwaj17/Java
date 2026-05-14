package b01_patterns;

//5. 0-1 Triangle
//1
//0 1
//1 0 1
//0 1 0 1

public class BinaryTriangle {

	public static void main(String[] args) {
		
		int n=4;   // we can even take value from user
		for(int i = 0; i < n; i++) {
		    for(int j = 0; j <= i; j++) {

		        if((i + j) % 2 == 0)
		            System.out.print("1 ");
		        else
		            System.out.print("0 ");
		    }
		    System.out.println();
		}
		
		//above is best (preferred one)
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 ; j++) {
				if(j <= i) {
					if((i + j) % 2 == 0) System.out.print("1 ");
					else System.out.print("0 ");
				} 
//				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
