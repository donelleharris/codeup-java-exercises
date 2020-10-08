package movies;
import util.Input;

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
    public void setInfo(String title, String category){
        this.name = title;
        this.category = category;
    }

    //Getter(s)
    public String getName() {
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
}
