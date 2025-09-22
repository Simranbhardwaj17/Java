package t07_strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String name = "  Simran   ";
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.trim());
		
		//startsWith() -> give T/F
		System.out.println(name.startsWith(name));
		
		System.out.println("Simran".startsWith("Sim"));  //create obj of str
		
		System.out.println(name.startsWith("  Sim"));
		
		System.out.println(name.endsWith("  Sim"));
		
		System.out.println(name.endsWith("n   "));
		
		System.out.println(name.equals("  Simran   "));
		
		System.out.println(name.equalsIgnoreCase("  simran   "));
		
		System.out.println("Simran".charAt(3));
		
		char r = "bhardwaj".charAt(3);  //store ret val in 
		System.out.println(r);
		
		int weight = 25;
		String strWt = String.valueOf(weight);
		System.out.println("This is integer value: " + weight*2);
		System.out.println("This is string value: " + strWt);  //can't perform "*2" (arithmetic)
		System.out.println("This is string value: " + strWt + 2); //concatenate
		
		String sentence = "My name is Simran Bhardwaj";
		String newSent = sentence.replace("Simran", "Gudiya");
		System.out.println(newSent);
		System.out.println(sentence);
		
		System.out.println(newSent.contains("Gudiya"));
		
		//substring - continuous middle part of str
//		.substring(inclusive, exclusive)
		System.out.println(sentence.substring(3, 7));
		System.out.println(sentence.substring(3));
		
		//Split- ret arr of str
		String sentencee = "Hello, There, its me!";
		String words[] = sentencee.split(" ");  //remove both comma, space
		for(String word: words) {
			System.out.println(word);
		}
		
		//toCharArray - to convert into arr
		String color = "Red is best";
		char colorArr[] = color.toCharArray();
		for(char colorArray: colorArr) {
			System.out.println(colorArray);
		}
		
		String animal = "    ";
		if (animal.isEmpty()) {
			System.out.println("Empty");
		} else if (animal.isBlank())  {
			System.out.println("Blank");
		}
	}

}
