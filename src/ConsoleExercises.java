import java.util.Scanner;
import static java.lang.Integer.parseInt;
/*
* For the following exercises, create a new class named ConsoleExercises with a main method
* like the one in your HelloWorld class.
*/
public class ConsoleExercises {
    public static void main(String[] args) {
        /*
        * Copy this code into your main method:
                double pi = 3.14159;
        * Write some Java code that uses the variable pi to output the following:
                "The value of pi is approximately 3.14."
        * Don't change the value of the variable; instead, reference one of the links above and use
        * System.out.format to accomplish this. */

        double pi = 3.14159;
        System.out.printf("the value of pi is approximately %.2f.\n", pi);

        /* Scanner class: */

        //1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
            //What happens if you input something that is not an integer?
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number:");
        int wholeNumber = scan.nextInt();
        System.out.printf("The number entered was %s.\n", wholeNumber);

        //2. Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.
            //What happens if you enter less than 3 words?
            //What happens if you enter more than 3 words?
        System.out.println("Please enter your full name with middle initial:");
        String firstName = scan.next();
        String middleInitial = scan.next();
        String lastName = scan.next();
        System.out.printf("Hello, %s %s %s! \n", firstName, middleInitial, lastName);

        //3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
        // Then, display that sentence back to the user.
            //Do you capture all the words?
        //4. Rewrite the above example using the nextLine method.
        System.out.println("what is your favorite quote?");
        scan.useDelimiter("\n");
        String fullQuote = scan.next();
        scan.nextLine();
        System.out.printf("Wow, \"%s\" is a great quote.\n", fullQuote);

        //Calculate the perimeter and area of Codeup's classrooms.
        //1. Prompt the user to enter values of length and width of a classroom at Codeup.
            //Use the nextLine method to get user input and parse the resulting string to a numeric type.
                //Assume that the rooms are perfect rectangles.
                //Assume that the user will enter valid numeric data for length and width.
        //2. Display the area and perimeter of that classroom.
            //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle
            // is equal to 2 times the length plus 2 times the width.
        //Bonus:
        //In your perimeter/area calculator:
        // - Accept decimal entries.
        // - Calculate the volume of the rooms in addition to the area and perimeter.
        System.out.println("Please enter the length of the classroom:\n");
        String length = scan.next();
        System.out.println("Please enter the width of the classroom:\n");
        String width = scan.next();
        System.out.println("Please enter the height of the classroom:\n");
        String height = scan.next();
        float area = (Float.parseFloat(length) * Float.parseFloat(width));
        float perimeter = (Float.parseFloat(length) * 2 + Float.parseFloat(width) * 2);
        float volume = Float.parseFloat(length) * Float.parseFloat(width) * Float.parseFloat(height);
        System.out.printf("The area of the classroom is %.2f sf, \nthe perimeter is %.2f ft. \nand the volume of the classroom is %.2f cf.\n", area, perimeter, volume);
    }
}
