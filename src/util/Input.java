package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in);
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public String getString(){
//        System.out.println("Please enter your name: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Would you like to continue? [y/n]");
        String input = this.scanner.nextLine();
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.print("Enter your choice: ");
        int input = scanner.nextInt();
        if ( input < min || input > max ) {
            System.out.printf("%d is not a valid entry. ", input);
            return getInt(min, max);
        }
        return input;
    }
    public int getInt(){
        System.out.print("Please enter a number: ");
        int input = scanner.nextInt();
        return input;
    }

    public double getDouble(double min, double max){
        System.out.printf("Please enter a mixed number between %f & %f: (i.e. 4.3)", min, max);
        double input = scanner.nextDouble();
        if (input < min || input > max) {
            return getDouble(min, max);
        } else
            System.out.println("Thank you!");
        return input;
    }
    public double getDouble(){
        System.out.print("Please enter a mixed number: (i.e. 4.3)");
        double input = scanner.nextDouble();
        return input;
    }

}
