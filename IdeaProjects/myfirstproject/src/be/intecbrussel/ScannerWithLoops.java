package be.intecbrussel;

import java.util.Scanner;

public class ScannerWithLoops {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("enter number ");

        int pair = myScanner.nextInt();

        if (pair % 2 == 0) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}
