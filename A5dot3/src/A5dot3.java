/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */
import java.util.Scanner;

public class A5dot3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Kilograms\tPounds\n");
		

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		int kilograms = 0;
		while (kilograms <= 199){
			if ((kilograms++) % 2 == 0)
			System.out.printf(kilograms + "\t\t" + " %5.1f\n", kilograms * 2.2);
			
		}

	}

}
