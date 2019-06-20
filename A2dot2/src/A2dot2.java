/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */
import java.util.Scanner; // Scanner is in the java.util package

public class A2dot2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare a constant
		final double PI = 3.14159;
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
				
		//prompt User to enter radius and length
		System.out.print("Enter the radius and length of a cylinder:  ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		//Compute area
		double area = radius * radius * PI;
				
		//display results
		System.out.format("The area is %5.4f%n", area);
		
		//compute volume
		double volume = area * length;
		
		//display results
		System.out.format("The volume is %5.1f", volume);

	}

}
