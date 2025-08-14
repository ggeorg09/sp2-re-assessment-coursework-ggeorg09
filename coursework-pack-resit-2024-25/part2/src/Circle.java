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