/**
 * @file: hello_world.java
 * @autor: 1155050023
 * @date: 2016-08-31
 * @version: 1.0
 * @description:
 * 
 */
import java.util.Scanner;
public class HelloWorld {
	/**
	 * @description: Prints "Hello, World" to the terminal window.
	 * @param args
	 * @return void
	 */
	public static void main(String args[]){
		System.out.println("Hello, World");
    Scanner buffer = new Scanner(System.in);
    String name;
    System.out.println("What is your name?");
    name = buffer.nextLine();
    System.out.println("Hello, " + name);
	}
}
