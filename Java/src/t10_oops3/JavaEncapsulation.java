package t10_oops3;

public class JavaEncapsulation {

	public static void main(String[] args) {
		//Data Hiding is a part of Encapsulation
		
		//In a Main class, you would interact with the Person object like this:
		Person person1 = new Person();
        person1.setAge(30); // Use the setter to set the age
        person1.PrintAge(); // Use a method to display the age

        // Attempting to directly access or modify 'age' would result in a compilation error:
        // person1.age = -5; // Error: age has private access in Person

	}

}
//Encapsulation in Java is a core principle of Object-Oriented Programming (OOP) that involves bundling data (variables) and methods that operate on that data 
//into a single unit, typically a class. It is a mechanism for achieving data hiding and protecting the internal state of an object.
//
//Key Aspects of Encapsulation: 
//
//• Bundling Data and Methods: Encapsulation combines related data and the methods that manipulate that data within a single class. This promotes a clear and organized structure for your code. 
//• Data Hiding: A crucial aspect of encapsulation is data hiding, which means restricting direct access to the internal state (fields/variables) of an object from outside the class. 
//This is typically achieved by declaring the fields as private. 
//• Controlled Access: Instead of direct access, encapsulation provides controlled access to the encapsulated data through public methods, commonly known as "getter" and "setter" methods. 
//	 • Getter methods: (get...()) are used to retrieve the value of a private field. 
//	 • Setter methods: (set...()) are used to modify the value of a private field. These methods can include validation logic to ensure data integrity. 

//Example: 
//Consider a Person class with an encapsulated age field: 


class Person {
  private int age; // Private field, hidden from direct external access

  // Public setter method to set the age
  public void setAge(int newAge) {
      if (newAge >= 0) { // Data validation
          this.age = newAge;
      } else {
          System.out.println("Age cannot be negative.");
      }
  }

  // Public getter method to get the age
  public int getAge() {
      return age;
  }

  public void PrintAge() {
      System.out.println("The person's age is: " + age);
  }
}

//This demonstrates how encapsulation protects the age field from direct, uncontrolled modification while providing a controlled interface (setAge, getAge, PrintAge) for interaction. 




//Encapsulation refers to the bundling of fields and methods inside a single class. 
//It prevents outer classes from accessing and changing fields and methods of a class. 
//This also helps to achieve data hiding.


//It defines encapsulation as the bundling of fields and methods inside a single class.
//
//• Encapsulation is a fundamental concept of Object-Oriented Programming (OOP). 
//• It combines data (variables) and methods that operate on the data into a single unit, a class. 
//• It helps achieve data hiding by preventing direct access to a class's fields from other classes. 
//• This allows for controlled access to data and improves code security, modularity, and maintainability. 