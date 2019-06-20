/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */

import java.util.Scanner;

public class A3dot5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to Enter today's day
		System.out.print("Enter today's day: ");
		int day = input.nextInt();

		// Prompt user to enter number of days elapsed since today
		System.out.print("Enter the number of days elapsed since today: ");
		int numberDays = input.nextInt();

		System.out.print("Today is ");
		// Switch and calculate
		switch (day) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");

		}
		System.out.print(" and the future day is ");

		switch ((day + numberDays % 7)) {
		case 0:
			System.out.println("Sunday.");
			break;
		case 1:
			System.out.println("Monday.");
			break;
		case 2:
			System.out.println("Tuesday.");
			break;
		case 3:
			System.out.println("Wednesday.");
			break;
		case 4:
			System.out.println("Thursday.");
			break;
		case 5:
			System.out.println("Friday.");
			break;
		case 6:
			System.out.println("Saturday.");

		}

	}

}
