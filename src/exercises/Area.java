package exercises;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double l;
        double w;
        double area;

        Scanner inp;
        inp = new Scanner(System.in);

        System.out.println("What is the rectangle length?");
        l = inp.nextDouble();

        System.out.println("What is the rectangle width?");
        w = inp.nextDouble();

        area = l * w;

        System.out.println("The area of the rectangle is: " + area);
    }
}
