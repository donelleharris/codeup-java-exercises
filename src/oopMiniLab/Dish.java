package oopMiniLab;

/*
Create a class called oopMiniLab.Dish. This class will represent various restaurant dishes.
Include an integer property called “costInCents”
Include a string property called “nameOfDish”
Include a boolean property called “wouldRecommend”
Include a method called “printSummary” with a void return type
    this method will use a single printf method to print out the values of each of the instance
    properties in the following format:
      Cost: COST_IN_CENTS_HERE
      Name: NAME_OF_DISH_HERE
      Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
*/
public class Dish {
    public int costInCents;
    public String nameOfDish;
    public Boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost: %d%nName: %s%nRecommended: %s%n",
                costInCents,
                nameOfDish,
                wouldRecommend);
    }

}
