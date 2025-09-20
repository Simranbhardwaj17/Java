package t08_oops;

public class MethodOverloading {

	public static void main(String[] args) {
		
		Greet a1 = new Greet();
		a1.ask("Simu");
		a1.ask("Simran", 3);

	}

}

class Greet {
	
	void ask (String name){
		System.out.println("How r u " + name);
	}

	void ask(String name, int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println("How are you " + name);
		}
	}
}