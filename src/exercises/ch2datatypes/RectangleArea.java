package exercises.ch2datatypes;
import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length: ");
        int length = input.nextInt();
        System.out.println("Enter a width: ");
        int width = input.nextInt();
        int area = length * width;

        System.out.println("The area is " + area + " sqft");
    }

}
