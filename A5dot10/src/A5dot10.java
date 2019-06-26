/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */
import java.util.Scanner;

public class A5dot10 {

	/** Main method */

	public static void main(String[] args) {

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		int count = 1;
		for (int i = 100; i < 1000; i++)
			if (i % 5 == 0 && i % 6 == 0)
				System.out.print((count++ % 10 != 0) ? i + " " : i + "\n");

	} 

}
