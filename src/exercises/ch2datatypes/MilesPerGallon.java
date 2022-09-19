package exercises.ch2datatypes;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        int milesDriven = input.nextInt();
        System.out.println("How many gallons of gas has your car used? ");
        int gallonsOfGas = input.nextInt();
        int milesPerGallon = milesDriven / gallonsOfGas;

        System.out.println("You got approximately " + milesPerGallon + " miles per gallon.");
    }
}
