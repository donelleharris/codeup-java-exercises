import java.util.*;

//Arrays Exercises
// 1. Array Basics
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];
        persons[0] = new Person("Donelle");
        persons[1] = new Person("Jocelyn");
        persons[2] = new Person("Jace");

        for (Person person: persons){
            person.sayHello();
            System.out.println("Hello, " + person.getName() + ", welcome.");
        }

        persons = addPerson(persons, new Person("Madison"));

        for (Person person: persons){
            System.out.println(person.getName());
        }
    }
    public static Person[] addPerson (Person[]originalArray, Person newPerson)
    {
        int currentSize = originalArray.length;
        int newSize = currentSize + 1;
        Person[] tempArray = new Person[newSize];
        for (int i = 0; i < currentSize; i++) {
            tempArray[i] = originalArray[i];
        }
        tempArray[newSize - 1] = newPerson;
        return tempArray;
    }
}
