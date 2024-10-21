public class Shape {
        //Common attributes for all shapes
        String name;

        //Construct to utilize the shape's name
        public Shape(String name) {
            this.name = name;
        }

        //Method to display shape name (can be overridden)
        public void displayShape() {
            System.out.println("Shape: " + name);

        }

        //Method to calculate area (to be overridden by subclasses)
        public double calculateArea() {
            return 0;

        }
}
