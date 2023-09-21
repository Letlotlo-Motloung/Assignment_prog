/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentApplication;

import java.util.ArrayList;

public class StudentImpl extends Student {

    public StudentImpl(int id, String name, int age, String email, String course) {
        super(id, name, age, email, course);
    }
    class Student { 
    private final int id;
    private final String name;
    private final int age;
    private final String email;
    private final String course;

    
    public Student(int id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Getter methods for attributes (id, name, age, email, course)

    public void saveStudent(ArrayList<Student> students) {
        students.add(this);
    }

    public static Student searchStudent(ArrayList<Student> students, int studentId) {
        for (Student student : students) {
            if (student.id == studentId) {
                return student;
            }
        }
        return null;
    }

    public static boolean deleteStudent(ArrayList<Student> students, int studentId) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.id == studentId) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            return true;
        }
        return false;
    }

    public static void studentReport(ArrayList<Student> students) {
        System.out.println("Student Report:");
        for (Student student : students) {
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Email: " + student.email);
            System.out.println("Course: " + student.course);
            System.out.println();
        }
    }
}

}
