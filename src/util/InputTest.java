package util;

import util.Input;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

//        if (input.yesNo()){
//            System.out.println("this returns true");
//        } else System.out.println("this returns false");
//        input.getString();
//        input.yesNo();
//        input.getInt();
//        input.getInt(1, 10);
//        input.getDouble();
//        input.getDouble(.1, 10.0);
        input.getDouble(50, 150, "Please enter a mixed number between 50 & 150: ");
    }

}
