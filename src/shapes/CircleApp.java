package shapes;

import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble(0, 100000);
        Circle pokerChip = new Circle(radius);
        System.out.println("pokerChip = " + pokerChip.getCircumference());
        System.out.println("pokerChip.getArea() = " + pokerChip.getArea());
    }
}
