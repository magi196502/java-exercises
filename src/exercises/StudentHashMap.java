package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner userInput = new Scanner(System.in);

        int studentID = 0;
//      String studentName = " ";
        String studentName;

        System.out.println("Please enter the student name, press enter to finish: ");

        do {
            studentName = userInput.nextLine();

            if (!studentName.equals("")){
                studentID += 100;
                students.put(studentID, studentName);
            }
//          studentID = userInput.nextInt();
//          System.out.println("Enter the student name: ");


        } while (!studentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        for ( Map.Entry<Integer,String> student : students.entrySet()){
            System.out.println("Student ID: " + student.getKey() + " Studennt name: " + student.getValue());
        }
    }
}
