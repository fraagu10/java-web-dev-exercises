package exercises.ch3controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int id = 0;

        // Enter a student ID
        do {
            System.out.println("Enter student ID. Enter 0 to quit: ");
            id = in.nextInt();

            // If input is not empty, prompt will ask for student name
            if(id != 0) {
                System.out.println("Enter student name: ");
                String studentName = in.nextLine();
                students.put(id, studentName);

                // Read next line
                in.nextLine();
            }

        } while(id != 0);

        System.out.println("Student List:\n");

        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + " -- Student: "  + student.getValue().toString());
        }

    }
}
