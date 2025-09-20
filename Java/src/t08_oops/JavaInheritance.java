package t08_oops;

public class JavaInheritance {

	public static void main(String[] args) {
		
		House h1 = new House();
		h1.parking();
		System.out.println(h1.plot = 2000);
		h1.location = "Gujarat";
		System.out.println("Location is: " + h1.location);

	}

}

class Residence {
	
	int cost;
	String location;
	int elevators;
	
	void parking() {
		System.out.println("Parking avail");
	}
}

class House extends Residence {
	
	int plot;
	String gardenName;
	
}