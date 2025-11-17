package set_02_medium_logical;

import java.util.Scanner;

public class CountFreqOfEle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		int[] ele = new int[size];
		
		System.out.println("Enter the element of the array:");
		for (int i=0; i<size; i++) {
			System.out.print("Element " + (i+1) + " is : ");
			ele[i] = sc.nextInt();
		}
		
		System.out.print("Array is: " );
		for (int i=0; i<size; i++) {
			System.out.print(ele[i] + " ");
		}
		System.out.println();
		
		boolean[] visited = new boolean[ele.length];
		
		for (int i=0; i<size; i++) {
			if(visited[i] == true) {
				continue;
			}
			
			int count = 1;
			for (int j=i+1; j<ele.length; j++) {
				if (ele[i] == ele[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println(ele[i] + " occurs " + count + " times ");
		}
		
	}

}
