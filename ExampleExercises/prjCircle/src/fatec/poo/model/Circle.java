package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class Circle {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double calcDiameter() {
        return 2 * radius;
    }
}
