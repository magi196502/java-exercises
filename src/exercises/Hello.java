package exercises;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner userInput;
        String name;
        userInput = new Scanner(System.in);

        System.out.println("What is your name?");
        name = userInput.nextLine();

        System.out.println("Hello " +name+"!");

    }
}
