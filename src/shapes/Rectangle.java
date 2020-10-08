package shapes;
import java.util.*;

public class Rectangle {
    private int length;
    private int width;

    //getter
    public Rectangle(int side1, int side2){
        this.width = side2;
        this.length = side1;
    }
    public int side1 = this.length;

    public int side2 = this.width;

    public int getPerimeter(){
        int perimeter = 2 * length + 2 * width;
        System.out.println("perimeter of rectangle = " + perimeter);
        return perimeter;
    }
    public int getArea (){
        int area = length * width;
        System.out.println("area of rectangle = " + area);
        return area;
    }
}