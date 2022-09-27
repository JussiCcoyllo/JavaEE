package be.intecbrussel;

import java.util.Scanner;

public class GetallenLaagHoog {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a odd number between 0 and 20: ");
        int number1 = myScanner.nextInt();

        for (number1 = number1 ; number1 < 21; number1 += 2){
            System.out.println("Odd number: " + number1);
        }

        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Enter an even number between 1 and 19: ");
        int number2 = myScanner2.nextInt();

        for (number2 = number2; number2 > 0; number2 -=2){
            System.out.println("Even number: " + number2);
        }
    }
}
