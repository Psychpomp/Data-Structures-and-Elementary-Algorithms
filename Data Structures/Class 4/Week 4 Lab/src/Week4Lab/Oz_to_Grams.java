package Week4Lab;

import java.util.Scanner;

public class Oz_to_Grams {
    private static char a;

    public static void menu() {
        Scanner scr = new Scanner(System.in);
        System.out.println();
        System.out.println("CONVERSION MENU");
        System.out.println("Z - Convert Oz to Grams");
        System.out.println("F - Convert Feet to Centimeters");
        System.out.println("C - Convert Fahrenheit to Centigrade");
        System.out.println("Q - Quit");
        System.out.println("Choose an option:");
        a = scr.next().charAt(0);
        System.out.println();
    }

    public static void ozToGrams() {
        Scanner scr = new Scanner(System.in);
        double oz;
        double grams;
        System.out.println("Please enter number of ounces to convert:");
        oz = scr.nextDouble();
        grams = oz * 28.34952;
        System.out.println(oz + " Ounces equals " + grams + " grams.");
        return;
    }

    public static void main() {
        do {
            menu();
            if(a=='z'||a=='Z') {
                ozToGrams();
            }else if(a=='f'||a=='F') {
                Feet_to_Centimeters.feetToCentimeters();
            }else if(a=='c'||a=='C') {
                Fahrenheit_to_Centigrade.FtoC();
            }
        }while (a != 'q');
    }
}
