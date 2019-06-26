/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */

import java.util.Scanner;

public class A4dot12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a single Hexadecimal digit: ");
		char hexToString = input.nextLine().toUpperCase().charAt(0);
		
		
		String binaryResult = "";
		
		//  produce binary result
		
		switch (hexToString) {
		case '0':
			binaryResult = "0";
			break;
		case '1':
			binaryResult = "1";
			break;
		case '2':
			binaryResult = "10";
			break;
		case '3':
			binaryResult = "11";
			break;
		case '4':
			binaryResult = "100";
			break;
		case '5':
			binaryResult = "101";
			break;
		case '6':
			binaryResult = "110";
			break;
		case '7':
			binaryResult = "111";
			break;
		case '8':
			binaryResult = "1000";
			break;
		case '9':
			binaryResult = "1001";
			break;
		case 'A':
			binaryResult = "1010";
			break;
		case 'B':
			binaryResult = "1011";
			break;
		case 'C':
			binaryResult = "1100";
			break;
		case 'D':
			binaryResult = "1101";
			break;
		case 'E':
			binaryResult = "1110";
			break;
		case 'F':
			binaryResult = "1111";
			break;
		default:
			System.out.println(hexToString + " is invalid, Please enter a valid digit (0-9) or (A-F)");
			System.exit(1);
		}

		System.out.println("The binary value for the hexadecimal character " + hexToString + " is: " + binaryResult);
	}

}