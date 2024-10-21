//Circle.java
public class Circle extends Shape {
    //Specific attribute for circle
    double radius;

    //Constructor to initialize the circle radius
    public Circle(double radius) {
        super("Circle"); //Call the parent class constructor to set the name
        this.radius = radius;
    }

    // Override the calculateArea method

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    //Additional method to display the radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}
