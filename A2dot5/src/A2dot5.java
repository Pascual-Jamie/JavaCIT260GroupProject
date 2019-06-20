/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */
import java.util.Scanner; // Scanner is in the java.util package

public class A2dot5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter subtotal and gratuity
		System.out.print("Enter the subtotal and a gratuity rate:  ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
		
		//Compute gratuity total
		double gratuityTotal = subtotal * (gratuity / 100);
				
		//display results
		System.out.format("The gratuity is $%4.2f", gratuityTotal);
		
		//compute Total
		double total = subtotal + gratuityTotal;
		
		//display results
		System.out.format(" and total is $%4.2f.", total);
		
		
		

	}

}
