package Lesson3.Geometry;

public class Triangle extends Figure implements ITriangle {
    double sideA;
    double sideB;
    double sideC;
    double heightC;

    public Triangle(String fillColor, String borderColor, double sideA, double sideB, double sideC, double heightC) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightC = heightC;
    }

    @Override
    public double getArea() {
        return getArea(sideC, heightC);
    }

    @Override
    public double getPerimeter() {
        return getPerimeter(sideA, sideB, sideC);
    }
}