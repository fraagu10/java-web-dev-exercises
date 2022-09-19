package exercises.ch2datatypes;
import java.util.Scanner;

public class StringSearch {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search for: ");
        String word = input.nextLine().toLowerCase();
        input.close();

        boolean answer = search(word);
        System.out.println("Word present: " + answer);
    }

    public static boolean search(String searchTerm) {
        String passage = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, 'and what " +
                "is the use of a book,' thought Alice 'without pictures or conversation?'";

        Integer index = passage.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Word entered is at index " + index + ". It has a length of " + length);

        String editedPassage = passage.replace(searchTerm, "");
        System.out.println(editedPassage);

        if(passage.contains(searchTerm)) {
            return true;
        }
        return false;
    }
}
