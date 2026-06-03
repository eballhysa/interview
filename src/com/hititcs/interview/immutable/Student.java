package com.hititcs.interview.immutable;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    public final int id;
    public final String fullName;
    public final double gpa;
    public final ArrayList<Grade> grades;

    public Student(int id, String fullName, double gpa, ArrayList<Grade> grades) {
        this.id = id;
        this.fullName = fullName;
        this.gpa = gpa;
        this.grades = grades;
    }
    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public double getGpa() { return gpa; }
    public ArrayList<Grade> getGrades() { return grades; }
    @Override public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", gpa=" + gpa +
                ", grades=" + grades +
                '}';
    }
}
