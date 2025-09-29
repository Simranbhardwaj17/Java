package t10_oops3;

public class DataHiding {
		
		private int age;
		
		private String name;
		
		boolean canBeChanged = false; //now no one can change' set age value
		
		//As here var r pvt so, use getter_setter method to set or get(print) value 
//		public void setAge(int age) {  //for others to access age/ set age
//			this.age = age;
//		}
		
		public void setAge(int age) {  
			if(canBeChanged) {     //using set/get, we can apply ctrl/restriction over value to be set:- benefits of DataHiding
				if (age > 0) {
					this.age = age;
				}
			} else {
				System.out.println("Can't changed now");
			}
			
		}
		
		boolean canBeAccessed = true;
		
		public int getAge() {
			if (canBeAccessed) return age;
			return -1;
		}
		
}
//use of get_set, that we can apply control over get_set fn, when the value should change
//By this way, we achieve data privacy/ data hiding with the help of encap & access modifiers

//Data hiding is a way of restricting the access of our data members by hiding the implementation details. Encapsulation also provides a way for data hiding.
//We can use access modifiers to achieve data hiding.
//
//Note: People often consider encapsulation as data hiding, but that's not entirely true. 
//Encapsulation refers to the bundling of related fields and methods together. This can be used to achieve data hiding.
//
//Encapsulation in itself is not data hiding.



//Data hiding, also known as information hiding, is a core principle in object-oriented programming that aims to protect the internal state of an object from direct external access and modification. 
//This is achieved by concealing the implementation details of a class, making its data members (attributes) and certain methods inaccessible from outside the class.
//
//The primary goal of data hiding is to ensure data integrity and prevent unauthorized or accidental manipulation of an object's internal state. 
//It enhances the security and robustness of a program by controlling how data is accessed and modified. 
//
//Mechanisms for Data Hiding: 
//
//• Access Modifiers/Specifiers: Programming languages like Java, C++, and Python utilize access modifiers (e.g., private, protected) to control the visibility and accessibility of class members. 
//  Declaring data members as private restricts their access to only within the class itself, effectively hiding them from external code. 
//• Encapsulation: While often used interchangeably, encapsulation is distinct from data hiding. Encapsulation is the bundling of data and the methods that operate on that data into a single unit (a class). 
//  Data hiding is a consequence or benefit often achieved through encapsulation, particularly when access modifiers are used to make data members private and expose controlled access through public methods (getters and setters). 
//
//Example: 
//Consider a BankAccount class. To implement data hiding, the balance and accountNumber data members would be declared as private. This prevents external code from directly modifying these values. 
//Instead, public methods like deposit(), withdraw(), and getBalance() would be provided to interact with the account in a controlled manner, ensuring that any changes adhere to predefined rules and validations. 

//public class BankAccount {
//    private String accountNumber;
//    private double balance;
//
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//        }
//    }
//
//    public void withdraw(double amount) {
//        if (amount > 0 && balance >= amount) {
//            balance -= amount;
//        } else {
//            System.out.println("Insufficient funds or invalid amount.");
//        }
//    }
//}
//
//In this example, accountNumber and balance are hidden, and access is controlled through getBalance(), deposit(), and withdraw() methods. 