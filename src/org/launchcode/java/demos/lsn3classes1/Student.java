package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this. numberOfCredits = numberOfCredits;
        this.gpa = gpa;

    }

    public String getName() {
        return name;
    }

    public String setName(String aName) {
        return name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public int setStudentId(int aStudentId) {
        return studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public int setNumberOfCredits(int aNumberOfCredits) {
        return numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public double setGpa(double aGpa) {
        return gpa = aGpa;
    }


}