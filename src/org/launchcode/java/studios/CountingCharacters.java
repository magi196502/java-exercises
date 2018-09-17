package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

import static org.launchcode.java.studios.GetCharacterCount.getCharCount;

//package org.launchcode.java.studios;

public class CountingCharacters {
    public static void main(String[] args){
        // Search string
        String theString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                           "Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue." +
                           " Praesent quis rhoncus justo. Aliquam erat volutpat. " +
                           "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, " +
                           "dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula " +
                           "efficitur luctus.";

        // Convert the string to character array
        char[] theCharacters = theString.toCharArray();

        // Define HashMap for the character and counts
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Define character count array
        int charCount;

        // Loop through the character array
        for (char theChar : theCharacters){

            // Check for the existence of the key and get the
            // count if the key doesn't exist
            if (!charCounts.containsKey(theChar)) {
                // Get the character count by calling the getCharCount method
                charCount = getCharCount(theString, theChar);

                charCounts.put(theChar, charCount);
            }

        }

        // Print the HashMap contents
        for ( Map.Entry<Character,Integer> chr : charCounts.entrySet()){
            System.out.println(chr.getKey() + ": " + chr.getValue());
        }

    }
}
