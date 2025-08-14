/**
 * A GeometricObject has a color, a dateCreated, and a boolean filled.
 *
 * @author Paul Nulty
 */

import java.util.Date;
public abstract class GeometricObject {
	private String color; // The color
	private boolean filled; // Filled (true for yes)
	private Date dateCreated; // The date of creation

	/**
	* Construct a default GeometricObject with color white, unfilled
	*/
	protected GeometricObject() {
		this("white", false);
	}

	/**
	* Construct a GeometricObject with the specified color and filled value, initialise the dateCreated
	* @param color  color of the shape
	* @param filled is the shape filled in - true for yes
	*/
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}

	/** 
	 * @return String color accessor
	 */ 
	public String getColor() {
		return color;
	}

	
	/** 
	 * @param color color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/** 
	 * @return boolean color accessor
	 */ 
	public boolean isFilled() {
		return filled;
	}

	/** 
	 * @param filled set the boolean value for filled
	 */ 
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** 
	 * @return Date date accessor
	 */ 
	public Date getDateCreated() {
		return dateCreated;
	}

	// Abstract method getArea
	public abstract double getArea();

	// Abstract method getPerimeter
	public abstract double getPerimeter();

	/** 
	 * @return String return a string describing the GeometricObject
	 */ 
	@Override
	public String toString() {
		return "created: " + dateCreated + ", color: " + color + ", filled: " + filled;
	}
}
