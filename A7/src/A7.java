/**
 * @author Jamie Pascual
 * CIT 260
 */

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class A7 {

	/**Main Class A7
	 * @param args
	 */
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);

		// a test program for integer values using int
		int[] numValue = new int[10];
		DecimalFormat nv = new DecimalFormat("#.##");

		// Ask user for 10 integers
		System.out.print("Enter 10 Interger Values: ");

		for (int i = 0; i < numValue.length; i++) {
			numValue[i] = input.nextInt();
		}

		// Sort the Array
		Arrays.sort(numValue);

		// print up the Average, minimum and maximum
		System.out.printf("Average = %5.2f\n", Average(numValue));
		System.out.println("Minimum = " + nv.format(numValue[0]));
		System.out.println("Maximum = " + nv.format(numValue[numValue.length - 1]));

		// A test program for decimal values(doubles)
		double[] numValue2 = new double[10];
		// Ask user for 10 decimal Values for doubles
		System.out.print("Enter 10 decimal Values (doubles): ");

		for (int j = 0; j < numValue2.length; j++) {
			numValue2[j] = input.nextDouble();
		}
		// Sort the Array
		Arrays.sort(numValue2);

		// print up the Average, minimum and maximum
		System.out.printf("Average = %5.2f\n", Average(numValue2));
		System.out.printf("Minimum = %5.2f\n", numValue2[0]);
		System.out.printf("Maximum = %5.2f\n", numValue2[numValue2.length - 1]);
	}

	/**
	 * The Average Method 
	 * Purpose: its to get the average of the array numbers	 * 
	 * @param array
	 * @return sum / array.length
	 */
	public static double Average(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;

	}

	/**
	 * The Average Method 
	 * Purpose: its to get the average of the array numbers	 * 
	 * @param array
	 * @return sum / array.length
	 */
	public static double Average(double[] array) {
		double sum = 0;
		for (int j = 0; j < array.length; j++) {
			sum += array[j];
		}
		return sum / array.length;
	}

}
