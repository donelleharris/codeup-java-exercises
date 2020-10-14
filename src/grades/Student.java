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
        double sum = grades.stream().mapToDouble(n -> n).sum();
        return sum/grades.size();
    }

}
