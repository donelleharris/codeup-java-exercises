import java.util.Scanner;

public class consoleIOLecture {
    public static void main(String[] args) {
        //Output...
//        System.out.println("Console IO Lecture");
//
//        System.out.print("here");
//        System.out.print("there");
//
//        System.out.print("here\n");
//        System.out.print("there\n");
//
//        System.out.println("Hello" + " " + "World!");

//        int number = 2;
//        String typeOfPet = "dogs";
//        System.out.printf("I have %d %s", number, typeOfPet);
//
//        double currencyPennies = 1000;
//        System.out.printf("The cost of a typical drink at Starbucks is $%.2f.\n", currencyPennies/100);
//
//        double dollars = 10.123456;
//        System.out.printf("The cost of a typical drink at Starbucks is $%.2f.", dollars);



        //Input...
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your first name:");
//        String firstName = sc.next();
//        System.out.printf("Hello, %s!", firstName);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String firstName = sc.next();
        String middleName = sc.next();
        String lastName = sc.next();
        System.out.printf("Hello, %s %s %s!", firstName, middleName, lastName);
    }
}