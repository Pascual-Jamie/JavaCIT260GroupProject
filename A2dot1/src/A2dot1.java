/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */

import java.util.Scanner;  // Scanner is in the java.util package

public class A2dot1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter Celsius 
		System.out.print("Enter a degree in Celsius:  ");
		double celsius = input.nextDouble();
		
		//Convert Celsius to Fahrenheit
		double fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius + " degrees Celsius" + " is " + fahrenheit + " degrees Fahrenheit");

	}

}
