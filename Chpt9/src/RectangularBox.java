/**
 * @author Jamie Pascual CIT 260
 */

//Class Declaration
public class RectangularBox {

	private int height;
	private int depth;
	private int width;

	public RectangularBox() {

	}

	public RectangularBox(int h, int d, int w) {
		this.height = h;
		this.depth = d;
		this.width = w;

	}

	/**
	 * The Height Method Get height
	 * 
	 * @return height
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * The Depth Method Get Depth
	 * 
	 * @return depth
	 */
	public int getDepth() {
		return this.depth;
	}

	/**
	 * The Width Method Get width
	 * 
	 * @return width
	 */
	public int getWidth() {
		return this.width;
	}

	public void setHeight(int h) {
		if (h > 0) {
			this.height = h;
		} else {
			this.height = 1;
		}
	}

	public void setDepth(int d) {
		if (d > 0) {
			this.depth = d;
		} else {
			this.depth = 1;
		}
	}

	public void setWidth(int w) {
		if (w > 0) {
			this.width = w;
		} else {
			this.width = 1;
		}
	}

	// Getting the surface Area of the rectangle
	public int getSurfaceArea() {

		return (2 * this.width * this.depth) + (2 * this.depth * this.height) + (2 * this.height * this.width);

	}

	// Getting the volume of the rectangle
	public int getVolume() {

		return (this.width * this.depth * this.height);

	}

	public String toString() {
		return String.format("Height is %s\nDepth is %s\nWidth is %s\n", getHeight(), getDepth(), getWidth());
	}
}
