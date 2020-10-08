import java.util.Random;

//Arrays Exercises
//2. Server Name Generator
public class ServerNameGenerator {
    public static String[] adjectives = {"charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp", "tasty", "zealous"};
    public static String[] nouns = {"car", "man", "woman", "cat", "dog", "mouse", "tree", "coffee", "socks", "horse"};

    public static void main(String[] args) {

        System.out.println("Here is your server name: ");
//        System.out.println(getWords());
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }
    //My method
    public static String getWords(){
        Random random = new Random();
        int index1 = random.nextInt(adjectives.length);
        int index2 = random.nextInt(nouns.length);
        String serverName = adjectives[index1] + "-" + nouns[index2];
        return serverName;
    }
    //Alt. method (better because it will work with multiple String arrays at once)
    public static String getWord(String[] words){
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(words.length);
        return words[randomIndex];
    }
}
