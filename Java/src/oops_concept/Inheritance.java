package oops_concept;

class Animal { //parent class
	String color;
}

class Tiger extends Animal { //child class
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t1 = new Tiger();
		t1.color = "yellow";  //no err coz of inherit prop & mthd from Animal

	}

}
