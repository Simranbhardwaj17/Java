package t09_oops2;

public class MethodOverriding {

	public static void main(String[] args) {
		
		// There is a obj class i.e already defined, there r various methods define(pre-def) for that that u get recommended by IDE
		
//		If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
//		Method overriding is also known as runtime polymorphism. Hence, we can achieve Polymorphism in Java with the help of inheritance.

		Housey h1 = new Housey();
		h1.parking();
//		h1.plot = 6000;
		h1.location = "Rajgir";
		System.out.println("Location is: " + h1.location);

//		Residency r1 = new Residency();
//		r1.parking();
	}

}

class Residency {
	
	int cost;
	String location;
	int elevators;
	int RNum = 43;
	
	void parking() {
		System.out.println(this);  //as line 18 call so get Residency
		System.out.println("Parking avail");
	}
}

class Housey extends Residency {
	
	int plot;
	String gardenName;
	int RNum = 7;
	
	void parking() {
//		System.out.println(this);  //as Housey's obj h1 invoke this method in main fn
		System.out.println(this.RNum + "," + " Parking not avail");
	}
	
}