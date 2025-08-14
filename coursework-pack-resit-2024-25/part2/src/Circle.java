/**
 * Circle is GeometricObject that has a radius and have scalable interface to allow scaling the circle size.
 * 
 */

public class Circle extends GeometricObject implements Scalable { 
// The radius of the circle
 private double radius;

    /**
     * Creating the circle to be with radius 1.0
     */
    public Circle() { 
        this(1.0); 
    }
     /**
     * creating the circle with the radius
     * @param radius radius of the circle
     */
    public Circle(double radius) { 
        this.radius = radius; 
    }

    /**
     * Creating the circle with specified radius, color, and value
     * @param radius radius of the circle
     * @param color color of the circle
     * @param filled whether the circle is filled
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * @return the radius of the circle
     */
    public double getRadius() { 
        return radius; 
    }

    /**