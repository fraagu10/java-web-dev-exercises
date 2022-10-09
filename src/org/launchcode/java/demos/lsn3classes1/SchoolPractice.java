package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student firstStudent = new Student("Franco", 79343,
                1, 4.0);

        Teacher teacher = new Teacher("taylor", "carter", "stand up comedy", 18);

        System.out.println("Student:");

        System.out.println("name: " + firstStudent.getName()
        + "\nID: " + firstStudent.getStudentId() + "\nCredits: " + firstStudent.getNumberOfCredits() + "\nGPA: " + firstStudent.getGpa());

        System.out.println("\nTeacher:");

        System.out.println("first name: " + teacher.getFirstName() + "\nlast name: " + teacher.getLastName() + "\nsubject: " + teacher.getSubject()
        + "\nyears teaching: " + teacher.getYearsTeaching());
    }
}
