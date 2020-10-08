package shapes;

public class Rectangle {
    private double length;
    private double width;

    public double getPerimeter(double length, double width){
        double perimeter = 2 * length + 2 * width;
        return perimeter;
    }
    public double getArea (double length, double width){
        double area = length * width;
        return area;
    }

}
