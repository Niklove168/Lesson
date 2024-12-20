package Lesson3.Geometry;

public interface ICircle {
    default double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    default double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}