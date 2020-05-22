/**
 * 
 */
package myJavaProject;

import java.util.Scanner;

/**
 * @author jsanc
 *
 */
public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Hello Software Engineering World");
		System.out.println("Enter your name");
		String name = input.nextLine();
		System.out.println("Your name is :" + name);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Your age is: " + age);
	}
	

}
