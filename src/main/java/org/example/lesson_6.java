package org.example;
import java.util.*;

public class lesson_6 {

    public static void deleteFailingStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().averageGrade() < 3) {
                iterator.remove();
            }
        }
    }


    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.averageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }


    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        Set<Student> students = new LinkedHashSet<>();

        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Математика", 5);
        grades1.put("Физика", 4);
        grades1.put("Информатика", 5);
        students.add(new Student("Иванов Иван", "ИС-11", 1, grades1));


        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Математика", 4);
        grades2.put("Физика", 3);
        grades2.put("Информатика", 4);
        students.add(new Student("Сидорова Анна", "ИС-21", 2, grades2));

        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Математика", 2);
        grades3.put("Физика", 2);
        grades3.put("Информатика", 3);
        students.add(new Student("Кузнецов Олег", "ИС-21", 2, grades3));



        System.out.println();
        printStudents(students, 1);
        printStudents(students, 2);


        deleteFailingStudents(students);
        promoteStudents(students);

        System.out.println();
        for (int course = 1; course <= 2; course++) {
            printStudents(students, course);
        }
    }
}
