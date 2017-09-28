package Week4Lab;

import java.util.Scanner;

public class Main {
    private static char a;

    public static void startMenu() {
        Scanner scr = new Scanner(System.in);
        System.out.println();
        System.out.println("START MENU");
        System.out.println("C - View the Unit Conversion Menu");
        System.out.println("A - View the Array Menu");
        System.out.println("S - Sort a sample file alphabetically");
        System.out.println("Q - Quit");
        System.out.println("Choose an option:");
        a = scr.next().charAt(0);
        System.out.println();
    }
    public static void main(String[] args) {
        do {
            startMenu();
            if(a=='c'||a=='C') {
                Oz_to_Grams.main();
            }else if(a=='a'||a=='A') {
                Week2Lab.main();
            }else if(a=='s'||a=='S') {
                Week3Lab.main();
            }
        } while(a!='q'&&a!='Q');
    }
}
