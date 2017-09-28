package Week4Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Week2Lab {
    public static int[] primeNums = new int[500];
    public static char[][] multiDArray;
    private static char a;

    public static void primeNumGenerator() {
        int y = 0;
        for(int i=0; i<5000; i++) {
            boolean isPrime = true;
            double j = i;
            if(j<2) {
                continue;
            }
            for(int z = 2; z<6; z++) {
                if((j%z == 0)&&(j>3)&&(j!=5)) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime&&(y<500)) {
                primeNums[y] = i;
                y += 1;
            }
        }
        System.out.println(Arrays.toString(primeNums));
    }

    public static void multiTable() {
        Scanner scr = new Scanner(System.in);
        int length;
        do {
            System.out.println("Please enter a size (square units) for your table, maximum is 100:");
            length = scr.nextInt();
        } while (length > 100);
        int width = length;
        multiDArray = new char[length][width];
        for(char[] row : multiDArray) {
            Arrays.fill(row, 'O');
        }
        printTable();
        System.out.println("Please enter a number to multiply (must be <= " + length + "):");
        int y;
        do {
            y = scr.nextInt();
            if(y > length||y < 0) {
                System.out.println("Invalid number. Please enter a number between 0 and " + length + ":");
            }
        } while (y > length||y < 0);
        System.out.println("Please enter a another number to multiply by " + y + " (must be <= " + length + "):");
        int x;
        do {
            x = scr.nextInt();
            if(x > length|| x < 0) {
                System.out.println("Invalid number. Please enter a number between 0 and " + length + ":");
            }
        } while (x > length||x < 0);
        for(int i = 0; i<y; i++) {
            for(int j = 0; j<x; j++ ) {
                multiDArray[i][j] = 'X';
            }
        }
        int result = x*y;
        System.out.println(x + " times " + y + " equals " + result + ":");
        System.out.println();
        printTable();
        getCell();
    }

    public static void printTable() {
        for (int i = 0; i < multiDArray.length; i++) {
            for (int j = 0; j < multiDArray[i].length; j++) {
                System.out.print(multiDArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("X→→");
        System.out.println("   ↑");
        System.out.println("   ↑");
        System.out.println("   Y");
    }

    public static void getCell(){
        Scanner scr = new Scanner(System.in);
        char b;
        do {
            System.out.println("Press R to return to the menu or press C to get the value of a cell:");
            b = scr.next().charAt(0);
            if(b=='c'||b=='C') {
                System.out.println("Please enter an x coordinate for desired cell:");
                int x;
                int len = multiDArray.length - 1;
                do {
                    x = scr.nextInt();
                    if ((x >= multiDArray.length) || x < 0) {
                        System.out.println("Invalid number. Please enter a number between 0 and " + len + ":");
                    }
                } while ((x >= multiDArray.length) || x < 0);
                System.out.println("Please enter a y coordinate for desired cell:");
                int y;
                do {
                    y = scr.nextInt();
                    if ((y >= multiDArray.length) || y < 0) {
                        System.out.println("Invalid number. Please enter a number between 0 and " + len + ":");
                    }
                } while ((y >= multiDArray.length) || y < 0);
                int yFixed = (multiDArray.length - 1) - y;
                System.out.println("The cell at " + x + ", " + y + " is highlighted with a(n) " + multiDArray[yFixed][x]);
            }
        }while ((b != 'r')&&(b!='R'));
    }

    public static void menu() {
        Scanner scr = new Scanner(System.in);
        System.out.println();
        System.out.println("MENU");
        System.out.println("P - List the first 500 prime numbers from 0 to 5000 in an array");
        System.out.println("M - Use the multiplication array");
        System.out.println("Q - Quit");
        System.out.println("Choose an option:");
        a = scr.next().charAt(0);
        System.out.println();
    }

    public static void main() {
        do {
            menu();
            if(a=='p'||a=='P') {
                System.out.println("The first 500 prime numbers from 0 to 5000:");
                primeNumGenerator();
            }else if(a=='m'||a=='M') {
                multiTable();
            }
        } while ((a !='q')&&(a!='Q'));
    }
}
