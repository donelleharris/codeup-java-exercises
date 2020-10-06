package oopMiniLab;/*
Create a class of static fields (properties and methods) called oopMiniLab.DishTools
      - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000 (use the final keyword
        to make it a constant)
      - shoutDishName() - that takes in a oopMiniLab.Dish object and prints out the name in all caps
      - analyzeDishCost() - that takes in a oopMiniLab.Dish object and will print out either “More
        expensive than average” or “Less expensive than average”, depending on the value of the dish
        costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
      - flipRecommendation() - that takes in a oopMiniLab.Dish object and reverses the wouldRecommend
        boolean value
  Try out the oopMiniLab.DishTools methods with oopMiniLab.Dish objects in the oopMiniLab.DishTest main method
*/

import oopMiniLab.Dish;

public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish d){
        System.out.println(d.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish d) {
        if (d.costInCents == AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("Average cost");
        } else if (d.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average");
        } else System.out.println("Less expensive than average");
    }

    public static void flipRecommendation(Dish d){
        d.wouldRecommend = !d.wouldRecommend;
    }

}
