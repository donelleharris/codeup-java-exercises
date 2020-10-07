package movies;
import util.Input;

//Arrays Exercises
//3. Movie List
public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What would youlike to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category\n");
        System.out.println("Enter your choice: ");
        int userChoice = input.getInt(0,5);

    }
}
