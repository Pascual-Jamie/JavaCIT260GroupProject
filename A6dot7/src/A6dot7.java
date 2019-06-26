/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */
import java.util.Scanner;

public class A6dot7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//  Ask for user input on amount invested:
		System.out.print("The amount invested: ");
		double investment = input.nextDouble();

		// Ask for user input on interest rate
		System.out.print("Annual Interest Rate (%): ");
		double annualRate = input.nextDouble();

		// System.out.println("Years" + " %10s" + "Future Value%15s\n");
		System.out.printf("%-10s%-15s\n", "Years", "Future Value");

		annualRate *= 0.01;
		double year = 0;

		for (int i = 1; i <= 30; year++, i++) {
			System.out.printf("%-3.0f%10s%8.2f\n", year, " ", futureInvestmentValue(investment, annualRate / 12, i));
		}

	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}

}
