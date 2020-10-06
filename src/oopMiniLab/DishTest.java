package oopMiniLab;

/*
Create another class called oopMiniLab.DishTest
Add a main method and inside the method...
    1) instantiate a oopMiniLab.Dish object and assign it to a variable called dish1
    2) assign creative values for each of the properties
    3) test the printSummary() method by invoking it and checking if all instance
       values are correctly printed
*/
public class DishTest {
    public static void main (String[]args){
        Dish d = new Dish();
        d.wouldRecommend = true;
        d.nameOfDish = "Chicken Alfredo";
        d.costInCents = 1395;

        d.printSummary();
        DishTools.shoutDishName(d);
        DishTools.analyzeDishCost(d);
        DishTools.flipRecommendation(d);
    }
}
