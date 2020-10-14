import java.util.*;
import util.Input;

public class GroceryList {
    private String category;
    private String item;
    private int quantity;

    ArrayList<String> groceries;

    public void addItem(String item){
        groceries.add(item);
    }
    public void addCategory(String category){
        groceries.add(category);
    }
    public void addQty(int quantity){
        groceries.add(String.valueOf(quantity));
    }

    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        Input input = new Input();
        boolean confirm = input.yesNo("Would you like to create a grocery list? (y/N)");
        do{

            String userCategory = input.getString("Please select the category for your first item:\n" +
                    "1. Produce\n2. Meat & Seafood\n3. Dairy & Eggs\n4. Deli\n5. Pharmacy\n" +
                    "6. Health/Beauty\n7. Pantry\n8. Pets");
            if (userCategory.equals("1")){
                list.addCategory("Produce");
            } else if (userCategory.equals("2")) {
                list.addCategory("Meat & Seafood");
            } else if (userCategory.equals("3")) {
                list.addCategory("Dairy");
            } else if (userCategory.equals("4")) {
                list.addCategory("Deli");
            } else if (userCategory.equals("5")) {
                list.addCategory("Pharmacy");
            } else if (userCategory.equals("6")) {
                list.addCategory("Health/Beauty");
            } else if (userCategory.equals("7")) {
                list.addCategory("Pantry");
            } else if (userCategory.equals("8")) {
                list.addCategory("Pets");
            } else {
                System.out.println("That is not a valid choice.");
                userCategory = input.getString("Please select the category for your first item:\n" +
                        "1. Produce\n2. Meat & Seafood\n3. Dairy & Eggs\n4. Deli\n5. Pharmacy\n" +
                        "6. Health/Beauty\n7. Pantry\n8. Pets");
            }


            String groceryItem = input.getString("Please enter the item you'd like to add to your list: ");
            list.addItem(groceryItem);

            int itemQuantity = input.getInt("Please enter a quantity: ");
            list.addQty(itemQuantity);

            input.getInt("Please choose: \n 1. add item\n2. finalize list");
            if (input.equals(1)) confirm = true;
            else confirm = false;
        } while (confirm);

    }
}
