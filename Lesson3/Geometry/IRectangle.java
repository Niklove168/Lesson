package Lesson3.Geometry;

public interface IRectangle {
    default double getArea(double length, double width) {
        return length * width;
    }

    default double getPerimeter(double length, double width) {
        return 2 * (length + width);
    }