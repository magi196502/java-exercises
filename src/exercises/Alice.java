package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String wonder = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                        "and of having nothing to do: once or twice she had peeped into the book her " +
                        "sister was reading, but it had no pictures or conversations in it, 'and what " +
                        "is the use of a book,' thought Alice 'without pictures or conversation?'";

        String wonderCaps = wonder.toUpperCase();

        Scanner in;

        String searchText;

        boolean textFound;

        in = new Scanner(System.in);

        System.out.println("Enter the string to look for");
        searchText = in.nextLine();

        textFound = wonderCaps.contains(searchText.toUpperCase());

        if (textFound){
            System.out.println("The text '" + searchText + "' was found");
        } else {
            System.out.println("The text '" + searchText + "' was not found");
        }




    }
}
