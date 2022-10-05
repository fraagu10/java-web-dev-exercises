package exercises.ch3controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] arg) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for(int num : intArray) {
            if(num % 2 == 1) {
                System.out.println(num);
            }
        }

        String quote = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] arrInQuote = splitSentence(quote);
        System.out.println(Arrays.toString(arrInQuote));

    }

    public static String[] splitSentence(String sentence) {
        String[] splitSentenceArray = sentence.split("\\.");

        return new String[]{Arrays.toString(splitSentenceArray)};
    }

}
