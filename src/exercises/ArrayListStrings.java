package exercises;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStrings {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank " +
                "and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, 'and what " +
                "is the use of a book 'thought Alice 'without pictures or conversation?'";

        // Split the sentence string into an array
        String words[] = sentence.split(" ");

        // Create list
        List<String> wordsList;

        // Convert words array to an ArrayList
        wordsList = Arrays.asList(words);

        for (String word : wordsList){
            if(word.length() == 5) {
                System.out.println(word);
            }
        }


    }
}
