package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input (){
        scanner = new Scanner(System.in);
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public String getString(){
        System.out.println("Please enter your name: ");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Would you like to continue? [y/n]");
        String input = scanner.nextLine();
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public int getInt(){
        System.out.print("Please enter an integer: \n");
        String userInput;
        int input;
        try {
            userInput = scanner.nextLine();
            input = Integer.valueOf(userInput);
        } catch (Exception e) {
            System.err.println("That is not a valid entry. \n");
            input = getInt();
        }
        return input;
    }

    public int getInt(int min, int max){
        System.out.printf("Please enter an integer between %d & %d: (i.e. 4.3)", min, max);
        String userInput;
        int input;
        try {
            userInput = scanner.nextLine();
            input = Integer.valueOf(userInput);
            if (input >= max || input <= min) {
                System.out.println("That is not a valid entry. \n");
                input = getInt(min, max);
            } else return input;
        } catch (Exception e) {
            System.err.println("That is not a valid entry. \n");
            input = getInt(min, max);
        }
        return input;
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        String userInput;
        int input;
        try {
            userInput = scanner.nextLine();
            input = Integer.valueOf(userInput);
        } catch (Exception e) {
            System.err.println("That is not a valid entry. \n");
            if (prompt == null)
                prompt = "Enter an integer: \n";
            input = getInt(prompt);
        }
        return input;
    }

    public double getDouble(){
        System.out.println("Please enter a mixed number: ");
        String userInput;
        double input;
        try {
            userInput = scanner.nextLine();
            input = Double.valueOf(userInput);
        } catch (Exception e) {
            System.err.println("That is not a valid entry. ");

            input = getDouble();
        }
        return input;
    }

    public double getDouble(double min, double max){
        System.out.printf("Please enter a mixed number between %f & %f: ", min, max);
        String userInput;
        double input;
        try {
            userInput = scanner.nextLine();
            input = Double.valueOf(userInput);
            if (input >= max || input <= min) {
                System.err.println("That is not a valid entry. ");
                input = getDouble(min, max);
            } else return input;
        } catch (Exception e) {
            System.err.println("That is not a valid entry. ");
            input = getDouble(min, max);
        }
        return input;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        String userInput;
        double input;
        try {
            userInput = scanner.nextLine();
            input = Double.valueOf(userInput);
            if (input >= max || input <= min) {
                System.out.println("That is not a valid entry. ");
                input = getDouble(min, max, prompt);
            } else return input;
        } catch (Exception e) {
            System.err.println("That is not a valid entry. ");
            if (prompt == null)
                prompt = String.format("Enter a mixed number between %f and %f: ", min, max);
            input = getDouble(min, max, prompt);
        }
        return input;
    }
}
