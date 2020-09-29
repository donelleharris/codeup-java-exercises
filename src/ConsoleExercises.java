import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        //formatting number output
        double pi = 3.14159;
        System.out.printf("the value of pi is approximately %.2f.\n", pi);

        //Scanner class:
        //1.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number:");
        int wholeNumber = scan.nextInt();
        System.out.printf("Your number is %s.\n", wholeNumber);

        //2.
        System.out.println("Please enter your full name with middle initial:");
        String firstName = scan.next();
        String middleInitial = scan.next();
        String lastName = scan.next();
        System.out.printf("Hello, %s %s %s! \n", firstName, middleInitial, lastName);

        //3.
        System.out.println("what is your favorite quote?");
        scan.useDelimiter("\n");
        String fullQuote = scan.next();
        scan.nextLine();
        System.out.printf("Wow, \"%s\" is a great quote.\n", fullQuote);

        //Calculate
        System.out.println("What is the length, width and height of the classroom?");
        String length = scan.next();
        String width = scan.next();
        String height = scan.next();
        System.out.printf("The area of the classroom is " + Float.parseFloat(length) * Float.parseFloat(width)
                + " sf, the perimeter is " + (Float.parseFloat(length) * 2 + Float.parseFloat(width) * 2)
                + " ft. The volume of the classroom is "
                + Float.parseFloat(length) * Float.parseFloat(width) * Float.parseFloat(height) + " cf. \n");
    }
}
