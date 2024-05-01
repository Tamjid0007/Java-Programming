package com_example1;

public class Student extends Person {
    private int id;
    private String major;

    // Constructor
    public Student(String name, int age, int id, String major) {
        super(name, age);
        this.id = id;
        this.major = major;
    }

    // Getter and setters for id and major
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() +
                ", id=" + id +
                ", major='" + major + '\'';
    }
}
