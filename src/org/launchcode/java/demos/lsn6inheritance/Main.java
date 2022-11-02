package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        System.out.println("Our house cat makes this noise: " + garfield.noise());
        System.out.println("Satisfied: " + garfield.isSatisfied());
        System.out.println("Tired: " + garfield.isTired());
        System.out.println("Hungry: " + garfield.isHungry() + "\n");
        garfield.eat();
        System.out.println("Hungry: " + garfield.isHungry());
        garfield.sleep();
        System.out.println("Satisfied: " + garfield.isSatisfied());
        System.out.println("Our house cat now makes this noise: " + garfield.noise());
    }
}
