public class ShapeExample {
    public static void main(String[] args) {
        // Polymorphic behavior
        Shape shape;

        // Circle
        shape = new Circle("Red", 5.0);
        shape.displayColor();
        System.out.println("Circle Area: " + shape.calculateArea());
        System.out.println("Circle Perimeter: " + shape.calculatePerimeter());
        ((Circle) shape).displayRadius(); // Downcasting to access Circle-specific method

        System.out.println();

        // Rectangle
        shape = new Rectangle("Blue", 4.0, 6.0);
        shape.displayColor();
        System.out.println("Rectangle Area: " + shape.calculateArea());
        System.out.println("Rectangle Perimeter: " + shape.calculatePerimeter());
        ((Rectangle) shape).displayDimensions(); // Downcasting to access Rectangle-specific method

        System.out.println();

        // Triangle
        shape = new Triangle("Green", 3.0, 4.0, 5.0);
        shape.displayColor();
        System.out.println("Triangle Area: " + shape.calculateArea());
        System.out.println("Triangle Perimeter: " + shape.calculatePerimeter());
        ((Triangle) shape).displaySides(); // Downcasting to access Triangle-specific method
    }
}
