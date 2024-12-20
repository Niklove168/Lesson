package Lesson3.Geometry;

public class Figure {
    protected double perimeter;
    protected double area;
    private String fillColor;
    private String borderColor;

    public Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;

    }

    public double getPerimeter() {
        return perimeter;
    }

    //public void setPerimeter(double perimeter) {
    //   this.perimeter = perimeter;
    //}

    public double getArea() {
        return area;
    }

    //public void setArea(double area) {
    //    this.area = area;
    // }

    public String getFillColor() {
        return fillColor;
    }

    // public void setFillColor(String fillColor) {
    //     this.fillColor = fillColor;
    //  }

    public String getBorderColor() {
        return borderColor;
    }

//    public void setBorderColor(String borderColor) {
//        this.borderColor = borderColor;
//    }
//
//}
}