package movies;

//Arrays Exercises
//3. Movie List
public class Movies {
    private String name;
    private String category;

    public Movies(String name, String category){
        this.name = name;
        this.category = category;
    }
    public String getMovieName(){
        //return the movie's name
        return this.name;
    }
    public void setMovieName(String name){
        //change the name property to the passed value
        this.name = name;
    }

    public String getMovieCategory(){
        //return the movie's category
        return this.category;
    }

}
