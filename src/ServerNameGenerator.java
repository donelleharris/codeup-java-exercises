import java.util.*;

//Arrays Exercises
//2. Server Name Generator
public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = {"charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp", "tasty", "zealous"};
        String[] nouns = {"car", "man", "woman", "cat", "dog", "mouse", "tree", "coffee", "socks", "horse"};

        Random random = new Random();
        int index1 = random.nextInt(adjectives.length);
        int index2 = random.nextInt(nouns.length);

        System.out.println("Here is your server name: ");
        System.out.println(adjectives[index1] + "-" + nouns[index2]);

    }
}
