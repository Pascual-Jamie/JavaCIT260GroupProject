/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */
import java.util.Scanner;

public class A4dot23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create a Scanner
		
		Scanner input = new Scanner(System.in);
		
		//Ask user for information about their pay check
		
		System.out.print("Enter employee's name: ");
		String eName = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate(%): ");
		double fedTax = input.nextDouble();
		System.out.print("Enter state tax withholding rate(%): ");
		double stateTax = input.nextDouble();
		
		// Calculate different calculations 
		double eGross = hWorked * payRate;
		double fedWith = eGross * (fedTax / 100);
		double stateWith = eGross * (stateTax / 100);
		double totalDed = fedWith + stateWith;
		double netPay = eGross - totalDed; 
		
		
		//Print out Calculations to user
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Employee Last Name: " + eName); 
		System.out.printf("Hours worked: %4.2f%n", hWorked); 
		System.out.printf("Pay Rate: $%5.2f%n", payRate);
		System.out.printf("Gross Pay: $%5.2f%n", eGross);
		System.out.printf("Deductions:%n");
		System.out.printf("	Federal Withholding (%2.0f%%): $%5.2f%n", fedTax, fedWith);
		System.out.printf("	State Wtihholding (%2.0f%%): $%5.2f%n", stateTax, stateWith);
		System.out.printf("	Total Deductions: $%5.2f%n", totalDed);
		System.out.printf("Net Pay: $%5.2f%n", netPay);
	}

}
