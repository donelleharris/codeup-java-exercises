package movies;
import util.Input;

//Arrays Exercises
//3. Movie List
public class MoviesApplication {
    public static void main(String[] args) {
        //User Menu
        DisplayUI();
        //User choice
        int userChoice = new Input().getInt();
        displayUserSelection(userChoice);
    }
    public static int userChoice;
    public static void DisplayUI(){
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a new movie");
    }

    public static void displayUserSelection(Integer option){
        switch(option) {
            case 0:
                // TODO = exit
                System.out.println("Goodbye! (AOL sound)");
                System.exit(0);
                break;
            case 1:
                System.out.println("Category: All");
                DisplaySelectedMovies("all");
                break;
            case 2:
                System.out.println("Category: Animated");
                DisplaySelectedMovies("animated");
                break;
            case 3:
                // TODO = show drama
                System.out.println("Category: Drama");
                DisplaySelectedMovies("drama");
                break;
            case 4:
                // TODO = show horror
                System.out.println("Category: Horror");
                DisplaySelectedMovies("horror");
                break;
            case 5:
                // TODO = show scifi
                System.out.println("Category: Sci-Fi");
                DisplaySelectedMovies("scifi");
                break;
//            case 6:
//                addMovie(???, addNewMovie());
//                break;

        }

        goAgain();

    }

    public static String[] addNewMovie(){
        System.out.println("Enter movie title: ");
        String newTitle = new Input().getString();
        System.out.println("Enter movie category: ");
        String category = new Input().getString();
        return new String[]{newTitle, category};
    }
    public static Movie[] addMovie (Movie[]originalArray, Movie newMovie)
    {
        int currentSize = originalArray.length;
        int newSize = currentSize + 1;
        Movie[] tempArray = new Movie[newSize];
        for (int i = 0; i < currentSize; i++) {
            tempArray[i] = originalArray[i];
        }
        tempArray[newSize - 1] = newMovie;
        return tempArray;
    }
    public static void DisplaySelectedMovies(String selectedCategory){
        Movie[] moviesList = MoviesArray.findAll();
        if(selectedCategory.equals("all")){
            for(Movie movie : moviesList){
                System.out.printf("title: %s | category: %s\n", movie.getName(), movie.getCategory());
            }
        } else {
            for(Movie movie : moviesList){
                if(movie.getCategory().equals(selectedCategory)){
                    System.out.printf("title: %s | category: %s\n", movie.getName(), movie.getCategory());
                }
            }
        }
    }

    public static void goAgain(){

        System.out.println("Would you like to make another selection? (y/N)");
        boolean input = new Input().yesNo();
        if(input) {
            DisplayUI();
            userChoice = new Input().getInt();
            displayUserSelection(userChoice);
        } else {
            System.out.println("Goodbye! (AOL sound)");
            System.exit(0);
        }
    }
}
