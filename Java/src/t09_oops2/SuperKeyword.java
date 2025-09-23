package t09_oops2;

public class SuperKeyword {

	public static void main(String[] args) {
		//Must be first call inside cons(on top), can use both this & super in same cons coz both want to be on top 
//		super is a special keyword in Java that is used to refer to the instance of the immediate parent class.
//		Uses of super Keyword in Java
//			It is used to refer to an instance variable of the immediate parent class.
//			It is used to invoke a method of the immediate parent class.
//			It is used to invoke a constructor of immediate parent class.
		
		
		Home h1 = new Home();
		h1.parking();
//		h1.plot = 6000;
		System.out.println("Location is: " + h1.location); //GJ
		h1.location = "Rajgir";
		System.out.println("Location is: " + h1.location);  //get update to RG
		
//		super.Dwelling();   //Error:- Cannot use super in a static context

		
//		Residency r1 = new Residency();
//		r1.parking();
	}

}

class Dwelling {
	
	int cost;
	String location;
	int elevators;
	int RNum = 43;
	
	Dwelling() {
		System.out.println("It contain all residential places to live");
	}
	
	Dwelling(String location) {
		this.location = location;
		System.out.println("Location of dwelling is: " + this.location);
		System.out.println("Location of residential places to live invoked");
	}
	
	
	void parking() {
//		System.out.println(this);  
		System.out.println("Parking may be avail");
	}
}

class Home extends Dwelling {
	
	int plot;
	String gardenName;
	int RNum = 7;
	
	Home() {
		super("GJ");  //It only invoke param cons, not def cons
		System.out.println("It's a place where your soul belong to!!"); 
	}
	
	void parking() {
		super.parking();
//		System.out.println(this);  //as Housey's obj h1 invoke this method in main fn
		System.out.println(this.RNum + "," + " Parking not avail");
	}
	
}
