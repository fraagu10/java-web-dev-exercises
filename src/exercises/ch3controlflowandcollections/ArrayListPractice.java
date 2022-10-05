package exercises.ch3controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numbersArray = new ArrayList<>();
        numbersArray.add(2);
        numbersArray.add(6);
        numbersArray.add(12);
        numbersArray.add(7);
        numbersArray.add(11);
        numbersArray.add(13);
        numbersArray.add(3);
        numbersArray.add(20);
        numbersArray.add(22);
        numbersArray.add(30);
        numbersArray.add(3);
        System.out.println("The sum of all even numbers is: " + sumOfEven(numbersArray));

        ArrayList<String> list = new ArrayList<>();
        list.add("Drain");
        list.add("Supply");
        list.add("Water");
        list.add("Salsa");
        list.add("Metaphor");
        list.add("Superstitious");
        list.add("laughing");
        list.add("chemistry");
        System.out.println("Your words are: " + Arrays.toString(matchedWord(list)));

    }

    public static Integer sumOfEven(ArrayList<Integer> arr) {
        int totalSum = 0;
        for(Integer num : arr) {
            if(num % 2 ==0) {
                totalSum += num;
            }
        }

        return totalSum;
    }

    public static String[] matchedWord(ArrayList<String> wordList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of word to search for: ");
        int wordSize = input.nextInt();
        ArrayList<String> selectedWords = new ArrayList<>();

        for(String word : wordList) {
            if(word.length() == wordSize) {
                selectedWords.add(word);
            }
        }

        return selectedWords.toArray(new String[0]);
    }
}
