package oops_concept;

abstract class Animals {
	//no need to create its obj(so abst) specifically
	abstract void walk();
	
	Animals() {
		System.out.println("Animals cons");
	}
	
	public void eat() {
		System.out.println("Animals Eat");
	}
}

class Horse extends Animals {
	public void walk() {
		System.out.println("Walk on 4 legs");
	}
	
	Horse() {
		System.out.println("Horse cons");
	}
	
}

class Chicken extends Animals {
	public void walk() {
		System.out.println("Walk on 2 legs");
	}
}

public class AbstractionEx {

	public static void main(String[] args) {
		Horse h1 = new Horse();  //only by running it we see cons chaining(wile creating obj in inherit)
//		h1.walk();
//		Animals a1 = new Animals();  //err: Cannot instantiate/create the type Animals coz its a abs class(just a concept or blueprint
//		a1.walk();
//		h1.eat();

	}

}
//Abstract class have  abstract & non-abstract mthd