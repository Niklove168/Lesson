package Lesson3.Geometry;

public class Circle extends Figure implements ICircle {
    double radius;


    public Circle(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return getArea(radius);
    }

    @Override
    public double getPerimeter() {
        return getPerimeter(radius);
    }


}