package movies;
import util.Input;

import java.sql.SQLOutput;
import java.util.Scanner;
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
                System.out.println();
                //User Menu
                DisplayUI();
                //User choice
                int userChoice = new Input().getInt();
                displayUserSelection(userChoice);
                break;
            case 2:
                System.out.println("Category: Animated");
                DisplaySelectedMovies("animated");
                System.out.println();
                //User Menu
                DisplayUI();
                //User choice
                userChoice = new Input().getInt();
                displayUserSelection(userChoice);
                break;
            case 3:
                // TODO = show drama
                System.out.println("Category: Drama");
                DisplaySelectedMovies("drama");
                System.out.println();
                //User Menu
                DisplayUI();
                //User choice
                userChoice = new Input().getInt();
                displayUserSelection(userChoice);
                break;
            case 4:
                // TODO = show horror
                System.out.println("Category: Horror");
                DisplaySelectedMovies("horror");
                System.out.println();
                //User Menu
                DisplayUI();
                //User choice
                userChoice = new Input().getInt();
                displayUserSelection(userChoice);
                break;
            case 5:
                // TODO = show scifi
                System.out.println("Category: Sci-Fi");
                DisplaySelectedMovies("scifi");
                System.out.println();
                //User Menu
                DisplayUI();
                //User choice
                userChoice = new Input().getInt();
                displayUserSelection(userChoice);
                break;
            case 6:

                break;

        }

        Input userInput = new Input();
        if(option != 0 && userInput.yesNo()){
            int userChoice = userInput.getInt();
            displayUserSelection(userChoice);
        }

    }
//    public static void addMovie(String title, String category){
//        System.out.println("Please enter movie title: ");
//        Input input = new Input();
//        title = input.getString();
//        System.out.println("Please enter movie category: ");
//        category = input.getString();
//        setInfo(title, category);
//    }
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
}
