package t09_oops2;

public final class FinalKeyword {
		
	public static void main(String[] args) {
		
//		Final Keyword in Java
//		In Java, the final keyword is a non-access modifier that is used to define entities that cannot be changed or modified.
//		Final Variable :-  Variable with final keyword cannot be assigned again
//		Final Method :-  Method with final keyword cannot be overridden by its subclasses
//		Final Class :-  Class with final keywords cannot be extended or inherited from other classes

		Bungalows h1 = new Bungalows();
		h1.parking();
//		h1.cost = 6000;  err:- can't overwrite final var
		System.out.println("Location is: " + h1.location); //GJ
		h1.location = "Rajgir";
		System.out.println("Location is: " + h1.location);  //get update to RG
		
	}

}

class Shelters {
	
	final int cost = 9000; //must initialize final keyword
	
	String location;
	int elevators;
	int RNum = 43;
	
	Shelters() {
//		cost = 55; err:- cant overwrite final var
		System.out.println("It contain all Lodging places to live");
	}
	
	Shelters(String location) {
		this.location = location;
		System.out.println("Location of Lodging is: " + this.location);
		System.out.println("Location of Lodging places to live invoked");
	}
	
	
	final void parking() {		
		System.out.println("Parking may be avail");
	}
}

class Bungalows extends Shelters {
	
	int plot;
	String gardenName;
	int RNum = 7;
	
	Bungalows() {
		super("GJ");  //It only invoke param cons, not def cons
		System.out.println("It's a place where you can live !!"); 
	}
	
	//Err:- can't modify final mthd
//	void parking() {
//		Apartments ap = new Apartments();
//		ap.entry(this); //curr class Bungalow that run it, get passed there as param
//		super.parking();
//		System.out.println(this.RNum + "," + " Parking not avail");
//	}
	
	Bungalows growing() {
		return this;
	}

}

      //Err:- can't modify final class
//class Apartments extends FinalKeyword{
//	void entry (Bungalows bw) { //pass refer of Bw class
//		System.out.println(bw.plot + ", " + "Depends on plot size");	}
//}

