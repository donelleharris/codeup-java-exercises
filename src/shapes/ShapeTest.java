package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);

        System.out.println("Box 1");
        box1.getPerimeter();
        box1.getArea();

        System.out.println("Box 2");
        box2.getPerimeter();
        box2.getArea();
    }
}