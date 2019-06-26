/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */
import java.util.Scanner;

public class A6dot8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Make Table titles and lines

		System.out.printf("%-15s%-15s%5s%-15s%-15s\n", "Celsius", "Fahrenheit", "|    ", "Fahrenheit", "Celsius");
		System.out.println("---------------------------------------------------------------");

		double celsius = 40;
		double fahrenheit = 120;

		// Equation to get different numbers
		for (int i = 1; i <= 10; celsius--, fahrenheit -= 10, i++) {
			System.out.printf("%2.1f%16.1f%15s%5.1f%15.2f\n", celsius, celsiusToFahrenheit(celsius), "|    ",
					fahrenheit, fahrenheitToCelsius(fahrenheit));
		}
	}
	// Methods

	/** Convert from Celsius to Fahrenheit */

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5.0) * celsius + 32;
	}

	/** Convert from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
