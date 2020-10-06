package oopLecture;

import java.util.*;

public class Post {
    // number of views
    public static int blogViews;

    // blog name
    public static String nameOfBlog = "Justin's Blog";

    // title
    public String title;
    // author
    public String authorName;

    // datePosted
    public Date datePosted;
    // content
    public String content;

    // dateEdited
    public Date dateEdited;

    public void printTitleAndAuthor(){
        System.out.println("The title: " + this.title);
        System.out.println("The author is: " + this.authorName);
    }
//  This doesn't work yet...
//    public static String longestTitle(){
//        if (p1.title.length() > p2.title.length()){
//            return p1.title;
//        } else return p2.title;
//    }
    public static void main(String[] args) {
        Post p1 = new Post();
        p1.content = "I am what I am.";
        p1.title = "A Day in the Life";
        p1.authorName = "Max Smith";

        Post p2 = new Post();
        p2.content = "To be or not to be";
        p2.title = "Something by Shakespeare";
        p2.authorName = "William Skakespeare";

        p1.printTitleAndAuthor();
    }

}
