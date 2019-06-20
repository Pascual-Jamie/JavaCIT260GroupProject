/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */

import java.text.DecimalFormat;
//import java.util.Arrays;
import java.util.Scanner;

public class Chap9Assn {

	private static Scanner input;

	/**
	 * The main Class Chap9Assn
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int height = 0;
		int depth = 0;
		int width = 0;

		input = new Scanner(System.in);

		System.out.print("Enter the height of your box:");
		height = input.nextInt();
		System.out.print("Enter the depth of your box:");
		depth = input.nextInt();
		System.out.print("Enter the width of your box: ");
		width = input.nextInt();

		RectangularBox myRect = new RectangularBox(height, depth, width);

		System.out.println("\n" + myRect.toString());
		System.out.println("Surface Area = " + myRect.getSurfaceArea());
		System.out.println("Volume Area = " + myRect.getVolume() + "\n");

		int[] numValue = new int[10];
		DecimalFormat nv = new DecimalFormat("#.##");

		// Ask user for 10 integers
		System.out.print("Enter 10 Interger Values: ");

		for (int i = 0; i < numValue.length; i++) {
			numValue[i] = input.nextInt();
		}

		AveMinMax aStats = new AveMinMax();
		aStats.setIntArr(numValue);
		// print up the Average, minimum and maximum
		System.out.printf("\nAverage = %5.2f\n", aStats.getAverage());
		System.out.println("Minimum = " + nv.format(aStats.getMinimum()));
		System.out.println("Maximum = " + nv.format(aStats.getMaximum()));
	}

}
