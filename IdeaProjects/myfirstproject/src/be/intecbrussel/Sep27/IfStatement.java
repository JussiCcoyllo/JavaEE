package be.intecbrussel;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        //we hebben 4 dagdelen, ochtend, middag, avond en nacht, nu willen we een tijd controleren
        // input
        int time = 20;
        // 4 verschillende condities onderwerp dag 24u
        if (time >= 0 && time <= 6) {
            System.out.println("It's night");
        } else if (time > 6 && time <= 12) {
            System.out.println("");
        }

        // schrijf een if statement die controleert op leeftijd.
        // maak 5 categorien
        // en een default die de rest van de data opvangt.

//        Scanner myScanner = new Scanner(System.in);
//
//        System.out.println("enter your age in years: ");
//
//        int age = myScanner.nextInt();
//
//        if (age >= 0 && age <= 3) {
//            System.out.println("Your are a baby");
//            } else if (age > 3 && age <= 12){
//                System.out.println("You are a child");
//            } else if (age > 12 && age <= 18) {
//                System.out.println("You are a young");
//            } else if (age > 18 && age <= 70) {
//                System.out.println("You are an adult");
//            } else {
//                System.out.println("You are old");
//            }

        //2 oefening



        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the age from Joey");
        int joey = myScanner.nextInt();

        System.out.println("Enter the age from John");
        int john = myScanner.nextInt();

        System.out.println("Enter the age from Eddy");
        int eddy = myScanner.nextInt();


        if (joey > john && joey > eddy) {
            System.out.println("Joey is older");
        } else if (john > joey && john > eddy) {
            System.out.println("John is older");
        } else if (eddy > joey || eddy > john) {
            System.out.println("Eddy is older");
        } else {
            System.out.println("No body");
        }
    }
}


