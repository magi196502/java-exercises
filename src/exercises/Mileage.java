package exercises;
import java.util.Scanner;

public class Mileage {

    public static void main(String[] args){
        double miles;
        double gallons;
        double milesPerGallon;

        Scanner in;

        in = new Scanner(System.in);

        System.out.println("Please enter the miles driven");
        miles = in.nextDouble();

        System.out.println("Please enter the gallons used");
        gallons = in.nextDouble();

        milesPerGallon = miles / gallons;

        System.out.println("The miles driven " + " " + miles + " The gallons used " + gallons + " miles per galon " + milesPerGallon);
    }
}
