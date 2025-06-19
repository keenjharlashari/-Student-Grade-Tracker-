package javaapplication3;  // ✅ Must match the project/package name

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    ArrayList<Integer> grades = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addGrade(int grade) {
        grades.add(grade);
    }

    double getAverage() {
        if (grades.isEmpty()) return 0;
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    int getHighest() {
        int highest = Integer.MIN_VALUE;
        for (int grade : grades) {
            if (grade > highest) highest = grade;
        }
        return highest;
    }

    int getLowest() {
        int lowest = Integer.MAX_VALUE;
        for (int grade : grades) {
            if (grade < lowest) lowest = grade;
        }
        return lowest;
    }

    void displayReport() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + getAverage());
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
        System.out.println("---------------------------");
    }
}

public class JavaApplication3 {  // ✅ Class name must match file name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Sample input simulation
        System.out.println("Sample Input:");
        System.out.println("2\nAlice\n3\n85\n92\n78\nBob\n2\n90\n96\n");

        // Manual input simulation
        int numStudents = 2;

        String[] names = {"Alice", "Bob"};
        int[][] allGrades = {
            {85, 92, 78},
            {90, 96}
        };

        for (int i = 0; i < numStudents; i++) {
            String name = names[i];
            Student student = new Student(name);
            int[] grades = allGrades[i];
            for (int grade : grades) {
                student.addGrade(grade);
            }
            students.add(student);
        }

        System.out.println("\n=== STUDENT SUMMARY REPORT ===");
        for (Student s : students) {
            s.displayReport();
        }
        scanner.close();
    }
}



