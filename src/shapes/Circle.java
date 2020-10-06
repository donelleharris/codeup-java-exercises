package shapes;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getDouble(double min, double max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter a radius between %f & %f: ", min, max);
        double input = sc.nextDouble();
        return input;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

}
