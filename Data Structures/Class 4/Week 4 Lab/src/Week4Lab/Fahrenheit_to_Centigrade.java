package Week4Lab;

import java.util.Scanner;

public class Fahrenheit_to_Centigrade {
    public static void FtoC() {
        Scanner scr = new Scanner(System.in);
        double f;
        System.out.println("Please enter degrees Fahrenheit to convert:");
        f = scr.nextDouble();
        double c = (f - 32.0)*(5.0/9.0);
        System.out.println(f + " degrees Fahrenheit equals " + c + " degrees Centigrade.");
        return;
    }
}
