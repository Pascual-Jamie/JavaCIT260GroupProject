import java.util.Arrays;

/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */
public class AveMinMax {

	private int[] intArr;

	public AveMinMax() {

	}

	public int[] getIntArr() {
		return intArr;
	}

	public void setIntArr(int[] intArr) {
		this.intArr = intArr;
		Arrays.sort(this.intArr);
	}

	/**
	 * The Minimum Method 
	 * Get Minimum
	 * @return this.minimum
	 */
	public int getMinimum() {
		return this.intArr[0];
	}

	/**
	 * The Maximum Method 
	 * Get maximum
	 * @return this.maximum
	 */
	public int getMaximum() {
		return this.intArr[this.intArr.length - 1];
	}

	/**
	 * The Average Method  
	 * Purpose: its to get the average of the array numbers
	 * @param array
	 * @return sum / array.length
	 */
	public double getAverage() {
		int sum = 0;

		for (int i = 0; i < this.intArr.length; i++) {
			sum += this.intArr[i];
		}

		return sum / this.intArr.length;

	}
}
