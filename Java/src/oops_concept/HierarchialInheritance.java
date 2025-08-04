package oops_concept;

class Box {
	int pen;
	int pencil;
	public void displayBox() {
		System.out.println("Displays box items"); 
	}
}

class RectBox extends Box {
	public void printPen() {
		System.out.println("Displays pen"); 
	}
}

class TriBox extends Box {
	public void printPencil() {
		System.out.println("Displays pencil"); 
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		// From same (single) base class multiple derived cl

	}

}
