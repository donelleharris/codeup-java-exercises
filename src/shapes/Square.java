package shapes;
import java.util.*;

public class Square extends Rectangle{
    private int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }

    public int getPerimeter() {
        int perimeter = 4 * this.side;
        System.out.println("perimeter of square = " + perimeter);
        return perimeter;
    }

    public int getArea(){
        int area = (int) Math.pow(this.side, 2);
        System.out.println("area of square = " + area);
        return area;
    }
}