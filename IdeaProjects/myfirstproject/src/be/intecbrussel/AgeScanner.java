package be.intecbrussel;
import java.util.Scanner;

public class AgeScanner {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter your age");

        int age = myScan.nextInt();

        if (age <= 18) {
            System.out.println("You are too young \nGood bye");
        } else {
            System.out.println("You are old enough \nGood bye");

        }

    }
}
