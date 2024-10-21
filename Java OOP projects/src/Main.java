public class Main {
    public static void main(String[] args) {
        //Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        rectangle.displayShape();
        rectangle.displayDimensions();
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        System.out.println();

        //Create a circle object
        Circle circle = new Circle(4.0);
        circle.displayShape();
        circle.displayRadius();
        System.out.println("Area of the Circle " + circle.calculateArea());
    }
}
