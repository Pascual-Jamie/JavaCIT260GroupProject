/**
 * 
 */

/**
 * @author Jamie Pascual
 *
 */

//Class Declaration
public class MyPoint {
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	public double distance;

	public MyPoint() {
	}

	public MyPoint(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	/**
	 * The getX1 Method 
	 * Get x1
	 * @return this.x1
	 */
	public double getX1() {
		return this.x1;
	}

	/**
	 * The getX2 Method 
	 * get x2
	 * @return this.x2
	 */
	public double getX2() {
		return this.x2;
	}

	/**
	 * The getY1 Method 
	 * get y1
	 * @return this.y1
	 */
	public double getY1() {
		return this.y1;
	}

	/**
	 * The getY2 Method 
	 * get y2
	 * @return this.y2
	 */
	public double getY2() {
		return this.y2;
	}

	/**
	 * The getDistance1 Method 
	 * returning distance for part one
	 * @return distance
	 */
	public double getDistance1() {
		x1 = 0;
		y1 = 0;
		x2 = 10;
		y2 = 30.5;

		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		return distance;
	}

	/**
	 * The getDistance2 Method 
	 * returning the distance for part two from prompt
	 * @return distance
	 */
	public double getDistance2() {

		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		return distance;

	}

}
