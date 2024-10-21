//Rectangle.java
public class Rectangle extends Shape {
    //Specific attributes for rectangle
    double length;
    double width;

    //Construct to initialize the rectangle's dimensions
    public Rectangle(double length, double width) {
        super("Rectangle"); //Call the parent class contractor to set the name
        this.length = length;
        this.width = width;
    }

    //Override the calculateArea method
    @Override
    public double calculateArea() {
        return length * width;
    }

    //Additional method to display dimensions
    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width " + width);
    }
}