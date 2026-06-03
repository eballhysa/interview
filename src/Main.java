import com.hititcs.interview.immutable.Grade;
import com.hititcs.interview.immutable.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Grade> grades = new ArrayList<Grade>();
        grades.add(new Grade("CS101", "Spring2025", 1234, 9876, 87, "B+"));
        grades.add(new Grade("CS101", "Spring2025", 1234, 9876, 87, "B+"));
        Student student = new Student(9876, "Jane Doe", 3.4, grades);
    }
}