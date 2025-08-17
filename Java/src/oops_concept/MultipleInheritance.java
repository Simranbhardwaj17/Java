package oops_concept;

interface AnyAnimal {
	int eyes = 2; 
	public void walk(); 
	
	//can't create cons
	//can't create non-abs fn
}

interface Herbivore {
	
}

class Cow implements AnyAnimal, Herbivore {
	public void walk() { //imp
		System.out.println("Walk on 4 legs");
	}
}

public class MultipleInheritance {
	// It is imp by interfaces not classes

	public static void main(String[] args) {
    Cow c1 = new Cow();
		c1.walk();
	}

}