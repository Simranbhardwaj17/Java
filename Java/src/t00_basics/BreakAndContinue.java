package t00_basics;

public class BreakAndContinue {

	public static void main(String[] args) {
		//continue - skip current iteration
		//break - break/ exist the loop
		
		//print 0 to 9
		for(int i = 0; i <= 20; i++) {
			if(i == 10) break;
			System.out.println(i);  
		}
		
		//skip 2 & 5 in 1 to 20
		for(int s = 1; s <= 20; s++) {
			if (s==2 || s==5) continue;
			System.out.println(s);  
		}
		
		//skip 2 & 5 & greate than & equal to 15 rollno in 1 to 20
		for (int q = 1; q <= 20; q++) {
			if(q==2 || q==5 || q >= 15) continue;
			System.out.println("Gave toffee to: " + q);  
		}
		
//		//more efffective than above
		for (int q = 1; q <= 20; q++) {
			if (q==2 || q==5) continue;
			if (q >= 15) break;
			System.out.println("Gave toffee to: " + q);  
		}
		
		
		// print 2 to 8 even only
		for (int i = 2; i <= 20; i += 2) {
			if (i >= 10) break;  
			System.out.println(i);
//			if (i >= 10) break;    don't use after print s/t
		}
		

		//print 0 to 2 only
		int j = 0;
		while(j < 5) {
//			if (j == 3) break;
			System.out.println(j);
			j++;
			if (j == 3) break;  //more optimized
		}
			
		
		//skip 2
		for (int l = 1; l <= 4; l++) {
			if (l == 2) {
				continue;
			}
			System.out.println(l);
		}
		
	}

}
