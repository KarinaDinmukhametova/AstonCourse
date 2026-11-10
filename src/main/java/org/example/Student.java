package org.example;
import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grade;


    public Student(String name, String group, int course, Map<String, Integer> grade){
        this.name=name;
        this.group=group;
        this.course=course;
        this.grade=grade;
    }

    public String getName(){
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse(){
        return course;
    }

    public Map<String, Integer>  getGrade(){
        return grade;
    }

    public void setCourse(int course) {
        this.course = course;
    }





    public double averageGrade() {
        if (grade == null || grade.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int mark : grade.values()) {
            sum += mark;
        }
        return sum / grade.size();
    }

    @Override
    public String toString() {
        return String.format("%s (группа %s, курс %d, средний балл %.2f)",
                name, group, course, averageGrade());
    }
}
