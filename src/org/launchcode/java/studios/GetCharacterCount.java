package org.launchcode.java.studios;

public class GetCharacterCount {

    // Integer method will accept the string and the character
    // as inputs and return the integer character count
    public static int getCharCount(String str, char c){

        // Initialize the character count
        int charCount = 0;

        // Loop through the string one character at a time
        // and get the count of te character passed
        for (int i =0; i < str.length(); i++){

            // If the character matches the search
            // character increment the count
            if (str.charAt(i) == c){
                charCount += 1;
            }
        }

        // Return the character count
        return charCount;
        }

}
