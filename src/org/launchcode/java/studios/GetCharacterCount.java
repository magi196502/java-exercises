package org.launchcode.java.studios;

public class GetCharacterCount {

    public static int getCharCount(String str, char c){
        int charCount = 0;

        for (int i =0; i < str.length(); i++){
            if (str.charAt(i) == c){
                charCount += 1;
            }
        }

        return charCount;
        }

}
