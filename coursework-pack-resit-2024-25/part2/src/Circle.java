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
     * Setting the circle radius 
     * @param radius new radius to set
     */
    public void setRadius(double radius) { 
        this.radius = radius; 
    }

    /**
     * @return the diameter of the circle (2 * radius)
     */
    public double getDiameter() { 
        return 2 * radius; 
    }

    /**
     * Calculating the area of the circle
     * @return area = π * radius^2
     */
    @Override
    public double getArea() { 
        return Math.PI * radius * radius; 
    }

    /**
     * Calculate the circle perimeter 
     * @return perimeter = 2 * π * radius
     */
    @Override
    public double getPerimeter() { 
        return 2 * Math.PI * radius; 
    }
