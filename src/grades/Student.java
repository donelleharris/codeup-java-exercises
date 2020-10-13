package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(){
        this.name = "no name";
        this.grades = new ArrayList<>();
    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;
        for (int grade : grades){
            total += grade;
        }
        double average = (double) total/grades.size();
        return average;
    }


    public static void main(String[]args){
        Student sophie = new Student("sophie");
        sophie.addGrade(100);
        sophie.addGrade(70);
        System.out.println(sophie.getGradeAverage());


    }
}
