package Lesson3.Geometry;

public class Rectangle extends Figure implements IRectangle {
    double length;
    double width;

    public Rectangle(String fillColor, String borderColor, double length, double width) {
        super(fillColor, borderColor);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return getArea(length, width);
    }

    @Override
    public double getPerimeter() {
        return getPerimeter(length, width);
    }
}