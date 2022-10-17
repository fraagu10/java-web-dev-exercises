package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if(numberOfCredits >= 0 && numberOfCredits <= 29) {
            return "Student " + this.name + " is a Freshman.";
        } else if(numberOfCredits > 29 && numberOfCredits <= 59) {
            return "Student " + this.name + " is a Sophomore.";
        } else if(numberOfCredits > 59 && numberOfCredits <= 89) {
            return "Student " + this.name + " is a Junior.";
        } else if(numberOfCredits > 90) {
            return "Student " + this.name + " is a Sophomore.";
        }
        return "Please enter a valid input.";
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = this.gpa * this.numberOfCredits;
        double newTotalQualityScore = totalQualityScore + (courseCredits * grade);
        this.numberOfCredits += courseCredits;
        this.gpa = newTotalQualityScore/this.numberOfCredits;
    }

    // Custom toString method returning all student info
    public String toString() {
        return "\nStudent: " + this.name + "\nCredits: " + this.numberOfCredits +
                "\nGPA: " + this.gpa + "\nStudent ID: " + this.studentId;
    }

    // Custom equal method comparing IDs in order to determine identity
    public boolean equals(Object toBeCompared) {
        if(toBeCompared == this) {
            return true;
        }

        if(toBeCompared == null) {
            return false;
        }

        if(toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        Student nelly = new Student("Nelly", 2, 9, 3.6);

        sally.addGrade(12, 3.5);
        sally.addGrade(9, 3.8);
        nelly.addGrade(6, 3.0);
        nelly.addGrade(10, 3.8);


        System.out.println(sally.toString());
        System.out.println(nelly.toString());
    }
}
