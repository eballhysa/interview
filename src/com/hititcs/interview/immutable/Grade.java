package com.hititcs.interview.immutable;

public final class Grade {

    private final String courseCode;
    private final String semester;
    private final int instructorId;
    private final int studentId;
    private final int points;
    private final String letterGrade;

    public Grade(String courseCode, String semester, int instructorId, int studentId, int points, String letterGrade) {
        this.courseCode = courseCode;
        this.semester = semester;
        this.instructorId = instructorId;
        this.studentId = studentId;
        this.points = points;
        this.letterGrade = letterGrade;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getSemester() {
        return semester;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getPoints() {
        return points;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grade grade = (Grade) o;

        if (instructorId != grade.instructorId) return false;
        if (studentId != grade.studentId) return false;
        if (points != grade.points) return false;
        if (!courseCode.equals(grade.courseCode)) return false;
        if (!semester.equals(grade.semester)) return false;
        return letterGrade.equals(grade.letterGrade);
    }

    @Override
    public int hashCode() {
        int result = courseCode.hashCode();
        result = 31 * result + semester.hashCode();
        result = 31 * result + instructorId;
        result = 31 * result + studentId;
        result = 31 * result + points;
        result = 31 * result + letterGrade.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "courseCode='" + courseCode + '\'' +
                ", semester='" + semester + '\'' +
                ", instructorId=" + instructorId +
                ", studentId=" + studentId +
                ", points=" + points +
                ", letterGrade='" + letterGrade + '\'' +
                '}';
    }
}
