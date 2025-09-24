package t09_oops2;

public class ThisVsSuper {

	public static void main(String[] args) {
		// Use to pass as a var
		//Must be first call inside cons(on top), can use both this & super in same cons coz both want to be on top 
		
//		this keyword in Java               
//		this is an implicit reference variable keyword used to represent the current class.
//		this is to invoke methods of the current class.
//		this is used to invoke a constructor of the current class.
//		this refers to the instance and static variables of the current class.
//		this can be used to return and pass as an argument in the context of a current class object.
//				
//		super keyword in Java	
//		super is an implicit reference variable keyword used to represent the immediate parent class
//		super is used to invoke methods of the immediate parent class.
//		super is used to invoke a constructor of the immediate parent class.
//		super refers to the instance and static variables of the immediate parent class.
//		super can be used to return and pass as an argument in the context of an immediate parent class object.
		
		Bungalow h1 = new Bungalow();
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

class Lodging {
	
	int cost;
	String location;
	int elevators;
	int RNum = 43;
	
	Lodging() {
		System.out.println("It contain all Lodging places to live");
	}
	
	Lodging(String location) {
		this.location = location;
		System.out.println("Location of Lodging is: " + this.location);
		System.out.println("Location of Lodging places to live invoked");
	}
	
	
	void parking() {
		
//		System.out.println(this);  //as line 18 call so get Residency
		System.out.println("Parking may be avail");
	}
}

class Bungalow extends Lodging {
	
	int plot;
	String gardenName;
	int RNum = 7;
	
	Bungalow() {
		super("GJ");  //It only invoke param cons, not def cons
		System.out.println("It's a place where you can live !!"); 
	}
	
	void parking() {
		Apartment ap = new Apartment();
		ap.entry(this); //curr class Bungalow that run it, get passed there as param
		super.parking();
//		System.out.println(this);  //as Housey's obj h1 invoke this method in main fn
		System.out.println(this.RNum + "," + " Parking not avail");
	}
	
	Bungalow growing() {
		return this;
	}

}

class Apartment {
	void entry (Bungalow bw) { //pass refer of Bw class
		System.out.println(bw.plot + ", " + "Depends on plot size");	}
}