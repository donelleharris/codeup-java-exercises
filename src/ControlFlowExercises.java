import java.util.Formatter;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //1. a)
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        //1. b)
        int a = 0;
        do {
            System.out.println(a);
            a += 2;
        } while (a <= 100);

        int b = 100;
        do {
            System.out.println(b);
            b -= 5;
        } while (b >= -10);

        long c = 2;
        do {
            System.out.println(c);
            c = c * c;
        } while (c < 1000000);
        //1. c)
        for (int y = 100; y >= -10; y -= 5) {
            System.out.println(y);
        }

        for (long z = 2; z < 1000000; z = z * z) {
            System.out.println(z);
        }
        //2. Fizzbuzz
        // For Loop
        for (int x = 1; x <= 100; x++) {
            if (x % 15 == 0) {
                System.out.println("Fizzbuzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(x);
        }
        // Do While Loop
//        int f = 1;
//        do {
//            if (f % 15 == 0){
//                System.out.println("Fizzbuzz");
//            } else if (f % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (f % 5 == 0) {
//                System.out.println("Buzz");
//            } else System.out.println(f);
//            f++;
//        }while(f <= 100);
        // 3.
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userNumber = sc.nextInt();
        System.out.println("Here is your table!\n");

        System.out.println("Number | Squared | Cubed");
        System.out.println("------ | ------- | ------");
        for (int l = 1; l <= userNumber; l++) {
            System.out.printf("%-6d | %-7d | %d \n", i, i * i, i * i * i);
        }
        System.out.println();

        //4.
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to convert your numeric grade to a letter grade? (y/N)");
        String userInput = scan.next();
        Boolean confirmation = userInput.equalsIgnoreCase("y");

        while (confirmation == true) {
            System.out.println("Please enter your grade as a whole number between 0 and 100:");
            int userGrade = scan.nextInt();
            if (userGrade > 87) {
                System.out.println("A");
                System.out.println("Would you like to enter another grade? (y/N)");
                userInput = scan.next();
                confirmation = userInput.equalsIgnoreCase("y");
            } else if (userGrade < 88 && userGrade > 79) {
                System.out.println("B");
                System.out.println("Would you like to enter another grade? (y/N)");
                userInput = scan.next();
                confirmation = userInput.equalsIgnoreCase("y");
            } else if (userGrade < 80 && userGrade > 66) {
                System.out.println("C");
                System.out.println("Would you like to enter another grade? (y/N)");
                userInput = scan.next();
                confirmation = userInput.equalsIgnoreCase("y");
            } else if (userGrade < 67 && userGrade > 59) {
                System.out.println("D");
                System.out.println("Would you like to enter another grade? (y/N)");
                userInput = scan.next();
                confirmation = userInput.equalsIgnoreCase("y");
            } else {
                System.out.println("F");
                System.out.println("Would you like to enter another grade? (y/N)");
                userInput = scan.next();
                confirmation = userInput.equalsIgnoreCase("y");
            }
        }
    }
}

