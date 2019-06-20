/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */
import java.util.Scanner;

public class A3dot11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter month and year

		System.out.print("Enter month (1-12): ");
		int month = input.nextInt();

		if (month < 1 || month > 12) {

			System.out.println("Sorry the number you imput is invalid. Please enter a number between 1-12.");
			return;
		}
		System.out.print("Enter year (e.g., 2019): ");
		int year = input.nextInt();
		int daysOfMonth = 0;

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		switch (month) {
		case 1:
			System.out.print("January ");
			daysOfMonth = 31;
			break;
		case 2:
			System.out.print("February ");
			if (isLeapYear == true) {
				daysOfMonth = 29;
			} else {
				daysOfMonth = 28;
			}
			break;
		case 3:
			System.out.print("March ");
			daysOfMonth = 31;
			break;
		case 4:
			System.out.print("April ");
			daysOfMonth = 30;
			break;
		case 5:
			System.out.print("May ");
			daysOfMonth = 31;
			break;
		case 6:
			System.out.print("June ");
			daysOfMonth = 30;
			break;
		case 7:
			System.out.print("July ");
			daysOfMonth = 31;
			break;
		case 8:
			System.out.print("August ");
			daysOfMonth = 31;
			break;
		case 9:
			System.out.print("September ");
			daysOfMonth = 30;
			break;
		case 10:
			System.out.print("October ");
			daysOfMonth = 31;
			break;
		case 11:
			System.out.print("November ");
			daysOfMonth = 30;
			break;
		case 12:
			System.out.print("December ");
			daysOfMonth = 31;
			break;
		default:
			System.out.println("Sorry the number you imput is invalid. Please enter a number between 1-12.");
			return;

		}

		System.out.print(year + " there are " + daysOfMonth + " days.");

	}

}
