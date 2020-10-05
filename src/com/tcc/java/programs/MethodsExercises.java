package com.tcc.java.programs;

import java.util.*;


public class MethodsExercises<num> {
    public static void main(String[] args) {
        addition(3, 4);
        subtraction(4, 3);
        multiplication(3, 4);
        division(12, 3);
        modulous(12, 3);

        getInteger(1, 10);
        factorial();

        Scanner diceScan = new Scanner(System.in);
        System.out.print("Roll dice? (y/N)");
        System.out.println("");

        boolean confirm = diceScan.next().equalsIgnoreCase("y");
        if (confirm){
            System.out.print("How many sides on your dice: ");
            int die1 = diceScan.nextInt();
            diceRoll(die1);
        }
    }

    public static double addition(double num1, double num2) {
        System.out.println(num1 + num2);
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        System.out.println(num1 - num2);
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        System.out.println(num1 * num2);
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        System.out.println(num1 / num2);
        return num1 / num2;
    }

    public static long modulous(long num1, long num2) {
        System.out.println(num1 % num2);
        return num1 % num2;
    }

    public static void diceRoll (int die1) {
        Random dice1 = new Random();
        int num1;
        int num2;
        num1 = dice1.nextInt(die1)+1;
        num2 = dice1.nextInt(die1)+1;
        System.out.println("Rolled: " + num1 + " & " + num2);
        Scanner diceScan = new Scanner(System.in);
        System.out.println("Roll again? (y/N)");
        boolean confirm = diceScan.next().equalsIgnoreCase("y");
        if (confirm){
            diceRoll(die1);
        } else {
            System.out.println("Thank you for playing!");
        }
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " & " + max + ": ");
        int input = sc.nextInt();
        if (input < min || input > max) {
            System.out.print("That is not a number between " + min + " & " + max + ". ");
            return getInteger(min, max);
        } else
            System.out.println("Thank you!");
            return input;
    }

    public static void factorial () {
        System.out.print("Let's look at factorials. ");
        int userNumber = getInteger(1, 10);
        System.out.println("Your number is: " + userNumber + "\nThe factorial of your number is below:");
        long output = 1;
        int center = userNumber + ((userNumber)*3 +2);
        StringBuilder centerStr = new StringBuilder(center);
        centerStr.append("1");
        Formatter f = new Formatter();
        for (int i = 1; i <= userNumber; i++){
            output *= i;
            if (i > 1){
                centerStr.append(" x " + i);
            }
            System.out.printf("%d! = %-" + center + "s = %d\n", i, centerStr, output);
        }
        String anotherFactorial = "n";
        System.out.print("Would you like to enter another number? (y/n) ");
        Scanner scan = new Scanner(System.in);
        anotherFactorial = scan.nextLine();
        if(anotherFactorial.equalsIgnoreCase("y")){
            factorial();
        } else System.out.println("Thank you for playing!");
    }
}