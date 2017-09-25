import java.util.Scanner;

public class Feet_to_Centimeters {
    public static void feetToCentimeters() {
        Scanner scr = new Scanner(System.in);
        double feet;
        System.out.println("Please enter number of feet to convert:");
        feet = scr.nextDouble();
        double centimeters = feet * 30.48;
        System.out.println(feet + " feet equals " + centimeters + " centimeters.");
        return;
    }
}
