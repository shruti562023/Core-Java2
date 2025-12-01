package oops;

public class ShapeMain {
    public static void main(String[] args) {
        // Create shape array
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);          // Circle radius 5
        shapes[1] = new Rectangle(4, 6);    // Rectangle 4x6
        shapes[2] = new Circle(3);          // Circle radius 3
        shapes[3] = new Rectangle(2, 7);    // Rectangle 2x7

        double totalArea = 0;

        // Calculate total area
        for (Shape s : shapes) {
            totalArea += s.area();
        }

        System.out.println("Total area of all shapes: " + totalArea);
    }
}