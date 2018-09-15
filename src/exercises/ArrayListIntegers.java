package exercises;

import java.util.ArrayList;

public class ArrayListIntegers {
    public static void main(String[] args){
        ArrayList<Integer> myInts = new ArrayList<>();

        int listLen = 10;

        int sumEvenNums = 0;

        for (int i = 0; i < listLen; i++){
            myInts.add(i);
        }

        for (int j = 0; j < myInts.size();j++){
            if(j % 2 == 0){
                sumEvenNums += j;
            }
        }

        System.out.println("The sum of even numbers is: " +sumEvenNums);
    }
}
