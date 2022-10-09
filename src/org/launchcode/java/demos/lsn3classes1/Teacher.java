package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;

    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String aFirstName) {
        return firstName = aFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String aLastName) {
        return lastName = aLastName;
    }

    public String getSubject() {
        return subject;
    }

    public String setSubject(String aSubject) {
        return subject = aSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public int setYearsTeaching(int aYearsTeaching) {
        return yearsTeaching = aYearsTeaching;
    }
}
