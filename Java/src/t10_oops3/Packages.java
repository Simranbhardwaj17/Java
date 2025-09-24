package t10_oops3;

public class Packages {

//	A package in Java is a mechanism for grouping related classes, interfaces, and sub-packages into a structured namespace, similar to a folder in a 
//	file system. Packages are fundamental for organizing code and preventing naming conflicts in large projects. 
//	
	
//	Purpose of packages--------
//		Using packages offers several key advantages for Java developers:
//		Encapsulation: Packages group related types, helping to enforce encapsulation and information hiding. You can define classes and members
//		that are only accessible within their own package, which provides a form of access control.
//		
//		Namespace management: They prevent naming collisions by allowing classes with the same name to exist in different packages. For instance, 
//		you can use both java.util.Date and java.sql.Date in the same program by specifying their full, qualified names.
//		
//		Organization and reusability: Packages organize a codebase into logical, manageable units. Related functionality, such as all your 
//		database-related classes, can be grouped, making the code easier to find, use, and reuse across different applications.
//		
//		Controlled access: Access modifiers like protected and default (package-private) provide fine-grained control over the visibility of
//		classes, methods, and variables. A default member is accessible only within its own package. 
//	
//	
	
//	Types of packages----------
//	There are two main types of packages in Java:
//	
//		1. Built-in packages
//		These are the packages included with the Java Development Kit (JDK). Some of the most common ones include: 
//		java.lang: Contains fundamental classes automatically imported into every Java program, such as String, Math, and Object.
//		java.util: Includes utility classes and data structures like ArrayList, HashMap, and the Scanner class.
//		java.io: Provides classes for input and output operations, such as file handling.
//		java.net: Contains classes for networking, including URLs and sockets. 
//		
//		2. User-defined packages
//		Developers can create their own packages to organize their project-specific code. This is essential for managing classes in large,
//		custom applications and libraries. 
//		
	
//	How to create a user-defined package-----------
//		Creating a package involves a simple, two-step process:
//			Use the package keyword: Declare the package at the very top of your Java source file using the package keyword, 
//			followed by the package name.
//			
//			Match the directory structure: Save your Java file in a directory structure that mirrors the package name. 
//			For example, a class in com.myapp.utilities should be stored in a com/myapp/utilities folder. 
//		
//		Example
//		Here is a simple example for creating and using a custom package.
//		
//		File 1: com/myapp/utils/Message.java
		
		// Declares the package
//		package com.myapp.utils;
//	
//		public class Message {
//		    public void printMessage() {
//		        System.out.println("Hello from my package!");
//		    }
//		}
//		
//	
//		File 2: Main.java
//		
//		// Imports the Message class from the com.myapp.utils package
//		import com.myapp.utils.Message;
//	
//		public class Main {
//		    public static void main(String[] args) {
//		        Message msg = new Message();
//		        msg.printMessage(); // Call the method from the imported class
//		    }
//		}
}
