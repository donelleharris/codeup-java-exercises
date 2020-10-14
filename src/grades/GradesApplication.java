package grades;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import util.Input;
public class GradesApplication {
    static HashMap<String, Student> students = new HashMap<>();


    public static void main(String[] args) {
        //Student donelle = new Student("Donelle");
        Student blossom = new Student("Blossom");
        Student ryan = new Student("Ryan");
        Student michael = new Student("Michael");

        students.put("donelleharris", new Student("Donelle"));
        students.put("blperez", blossom);
        students.put("rmk1776", ryan);
        students.put("michaels", michael);

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            students.get("donelleharris").addGrade(random.nextInt(100));
            students.get("blperez").addGrade(random.nextInt(100));
            students.get("rmk1776").addGrade(random.nextInt(100));
            students.get("michaels").addGrade(random.nextInt(100));
        }

        System.out.println("Welcome!\n" +
                "Here are the GitHub usernames of our students: \n");
        for (String student : students.keySet()){
            System.out.printf("|%s| ", student);
        }
        boolean confirm;
        do {
        System.out.println("\nWhich student would you like more information on?");
        Input input = new Input();

        String studentName = input.getString();

        if (students.containsKey(studentName)){
            Student selectedStudent = students.get(studentName);
            System.out.printf("Name: %s  - GitHub Username: %s \nCurrent Average: %.2f", selectedStudent.getName(), studentName, selectedStudent.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\"", studentName);
        }

        confirm = input.yesNo("\nWould you like to see another student?");

        } while (confirm);
        System.out.println("Goodbye, and have a wonderful day!");

    }
}
