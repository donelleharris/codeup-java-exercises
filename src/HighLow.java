import java.util.*;

public class HighLow {
    public static void main (String[]args){
        guessingNumberGame();

    }
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());

        int K = 10;

        int i, guess;

        System.out.println(
                "A number is chosen between 1 to 100.\n"
                + "You have 10 chances to guess correctly.");

        for (i = 0; i < K; i++) {

            System.out.print("Guess the number: ");

            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("GOOD GUESS!");
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println("HIGHER");
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println("LOWER");
            }
        }
        if (i == K) {
            System.out.println("You have no more guesses available.");

            System.out.println("The number was " + number);
        }
    }
}