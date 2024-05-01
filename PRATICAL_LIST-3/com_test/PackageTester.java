package com_test;

import com_example1.Student;

public class PackageTester {
    public static void main(String[] args) {
        Student student = new Student("Tamjeed Dhib", 21, 12345, "Computer Science");
System.out.println(student);
        student.setId(54321);
        student.setMajor("Master CS Engineering");

        System.out.println(student);
    }
}
