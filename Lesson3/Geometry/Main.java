package Lesson3.Geometry;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", "White", 5);
        System.out.println("Circle parameters:" + "\n"
                + "area " + circle.getArea() + "\n"
                + "perimeter " + (circle.getPerimeter() + "\n"
                + "fill color " + (circle.getFillColor() + "\n"
                + "border color " + circle.getBorderColor())) + "\n");
        Rectangle rectangle = new Rectangle("Blue", "Yellow", 10.5, 5.5);
        System.out.println("Rectangle parameters:" + "\n"
                + "area " + rectangle.getArea() + "\n"
                + "perimeter " + (rectangle.getPerimeter() + "\n"
                + "fill color " + (rectangle.getFillColor() + "\n"
                + "border color " + rectangle.getBorderColor())) + "\n");
        Triangle triangle = new Triangle("Green", "Pink", 10, 10, 5, 6);
        System.out.println("Triangle parameters:" + "\n"
                + "area " + triangle.getArea() + "\n"
                + "perimeter " + (triangle.getPerimeter() + "\n"
                + "fill color " + (triangle.getFillColor() + "\n"
                + "border color " + triangle.getBorderColor())) + "\n");

    }
}