package shapes;
import java.lang.ref.ReferenceQueue;
import java.util.*;

public class ShapeTest {
    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Rectangle(7, 7);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape= new Square(8);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}