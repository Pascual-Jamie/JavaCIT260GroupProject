/**
 * 
 */

/**
 * @author Jamie Pascual CIT 260
 */

import java.util.Scanner;

public class A10dot4 {

	private static Scanner input;

	/**
	 * The Main class A10dot4
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Create Scanner
		input = new Scanner(System.in);
		
		// get distance for given two points
		MyPoint mp1 = new MyPoint(0, 0, 10, 30.5);
		System.out.println(
				"First, find the distance between the two points (0,0) and (10,30.5), then you are asked to input some points."
						+ "\n");
		System.out.println("Distance between the two points (0,0) and (10,30.5) is " + mp1.getDistance1() + "\n");

		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		// prompt for input form user for the two points
		System.out.print("Enter your first x(x1) point: ");
		x1 = input.nextDouble();

		System.out.print("Enter your first y(y1) point: ");
		y1 = input.nextDouble();

		System.out.print("Enter your second x(x2) point: ");
		x2 = input.nextDouble();

		System.out.print("Enter your second y(y2) point: ");
		y2 = input.nextDouble();
		// get distance for the prompt two points from user.
		MyPoint mp2 = new MyPoint(x1, x2, y1, y2);
		System.out.println("Distance between the two points " + "(" + x1 + "," + y1 + ") and (" + x2 + "," + y2
				+ ") is " + mp2.getDistance2());
	}

}
