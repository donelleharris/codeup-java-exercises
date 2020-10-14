import java.util.*;
import util.Input;

public class GroceryList {

    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        boolean confirm = new Input().yesNo("Would you like to create a grocery list? (y/N)");
        ArrayList<String> groceries;
        if(confirm){
            System.out.println("Please select the category for the first item: \n");

            groceryItem.addItem();
            groceryItem.addQty();
            groceryItem.addCategory();

        }
    }
}
