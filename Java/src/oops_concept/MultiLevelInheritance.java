package oops_concept;

class Shape {
	public void area() {
		System.out.println("Displays area"); 
	}
}

class Triangle extends Shape {
	public void area(int l, int h) {
		System.out.println(1/2*l*h); 
	}
}

class EquiTriangle extends Triangle {
	public void area(int l, int h) {
		System.out.println(1/2*l*h); 
	}
}

public class MultiLevelInheritance {
	//Multi lvl inherit from same base class

	public static void main(String[] args) {
		

	}

}
