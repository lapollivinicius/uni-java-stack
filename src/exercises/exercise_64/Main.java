package src.exercises.exercise_64;

import src.exercises.exercise_63.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<Students> listApproved(List<Students> students) {
        List<Students> approved = new ArrayList<>();
        for (Students student : students) {
            if (student.getGrade() > 7) {
                approved.add(student);
            }
        }
        return approved;
    }

    public static double studentsAverage(List<Students> students) {
        double totalGrade = 0;
        for (Students student : students) {
            totalGrade += student.getGrade();
        }
        return totalGrade / students.size();
    }

    public static Students studentMaxGrade(List<Students> students) {
        Students current = students.getFirst();
        for (Students student : students) {
            if(student.getGrade() > current.getGrade()) {
                current = student;
            }
        }
        return current;
    }

    public static List<Students> sortByGrade(List<Students> students) {
        Collections.sort(students);
        return students;
    }

    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();

        students.add(new Students("John", 20, 9.8));
        students.add(new Students("Jane", 21, 8.3));
        students.add(new Students("Abby", 19, 8.9));
        students.add(new Students("Mary", 20, 6.6));
        students.add(new Students("Pete", 23, 8.2));

        System.out.println("STUDENTS -> " + students);
        System.out.println("APPROVED -> " + listApproved(students));
        System.out.println("AVERAGE -> " + studentsAverage(students));
        System.out.println("MAX GRADE -> " + studentMaxGrade(students));
        System.out.println("SORTED -> " + sortByGrade(students));


    }

}
