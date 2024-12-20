package Lesson3.Geometry;

public interface ITriangle {
    default double getArea(double sideC, double heightC) {
        return sideC * heightC / 2;
    }

    default double getPerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
}