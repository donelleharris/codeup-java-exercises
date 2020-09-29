import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        //formatting number output
        double pi = 3.14159;
        System.out.printf("the value of pi is approximately %.2f.\n", pi);

        //Scanner class:
        //1.
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a whole number:");
        int wholeNumber = number.nextInt();
        System.out.printf("Your number is %s.\n", wholeNumber);

        //2.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String firstName = sc.next();
        String middleName = sc.next();
        String lastName = sc.next();
        System.out.printf("Hello, %s %s %s! \n", firstName, middleName, lastName);

        //3.
        Scanner scanQuote = new Scanner(System.in);
        System.out.println("what is your favorite quote?");
        String quote = scanQuote.next();
        System.out.printf("Wow, \"%s\" is a great quote.\n", quote);

        //4.
        Scanner scanQuote2 = new Scanner(System.in);
        System.out.println("what is your favorite quote?");
        String fullQuote = scanQuote2.nextLine();
        System.out.printf("Wow, \"%s\" is a great quote.\n", fullQuote);

        //Calculate
        System.out.println("What is the length and width of the classroom?");
        String length = sc.next();
        String width = sc.next();
        System.out.printf("The area of the classroom is " + Float.parseFloat(length) * Float.parseFloat(width) + ".\n");
    }
}
