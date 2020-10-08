package movies;
import util.Input;
import movies.MoviesArray;
//Arrays Exercises
//3. Movie List
public class Movie {
    private String name;
    private String category;

    //Constructor
    public Movie(String _name, String _category ){
        this.name = _name;
        this.category = _category;
    }
    //Setter(s)
    public String title = this.name;
    public String genre = this.category;

    public static void setInfo(String title, String genre){
        Movie movie = new Movie(title, genre);
    }

    //Getter(s)
    public String getName() {
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
}
