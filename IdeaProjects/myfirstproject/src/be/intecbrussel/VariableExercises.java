package be.intecbrussel;
import java.util.Scanner;

public class VariableExercises {

    public static void main(String[] args) {

        //oefening 1

        int number;
        number = 20;

        int myNumber = 5;
        System.out.println(myNumber);

        //oefening 2

        boolean myBoolean = true;
        //myBoolean = myNumber < 25;
        System.out.println(myBoolean);

        //oefening 3

        myNumber += 10;
        System.out.println(myNumber);

        myNumber -= 5;
        System.out.println(myNumber);

        myNumber *= 5;
        System.out.println(myNumber);

        myNumber /= 5;
        System.out.println(myNumber);

        int A = 10;
        int B = 20;
        int C = 0;

        C = (A + B);
        System.out.println(C);

        C += A;
        System.out.println(C);

        C -= A;
        System.out.println(C);

        C *= A;
        System.out.println(C);

        int num1 = 15;

        String message = num1 > 15 ? "Positif" : "Negatif";
        System.out.println(message);

        boolean bool1 = true;
        boolean bool2 = false;

        boolean r1 = (bool1 && bool2);
        boolean r2 = (bool1 || bool2);
        boolean r3 = !(bool1 && bool2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        int time = 22;

        if (time < 10) {
            System.out.println("Good moorning");
        } else if (time < 20) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        int num = 10;

        if (num > 0 && num < 10) {
            System.out.println("num falls in the range from 0 to 10");
        } else {
            System.out.println("num doesn't fall in the range from 0 to 10");
        }

        int num2 = 2;

        if (num2 > 0 || num2 < 10) {
            System.out.println("num falls in the range from 0 to 10");
        } else {
            System.out.println("num doesn't fall in the range from 0 to 10");
        }

        int day = 7;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid");
        }

        //Oefeningen Branching

        int number1 = 7;
        int number2 = 16;

        if (number1 <= 7 || number2 <= 16) {
            System.out.println("The number " + number2 + " is big");
        } else {
            System.out.println("error");
        }

        int input = 10;
        if (input < 0) {
            System.out.println("Negatif");
        } else if (input == 0) {
            System.out.println("number 0");
        } else {
            System.out.println("Positief");
        }

        String month = "March";
        int daysCount = 0;

        switch (month) {
            case "March":
                System.out.println("March " + (daysCount + 31) + " days");
            case "April":
                System.out.println("April " + (daysCount + 30) + " days");
                break;
            }


            //Scanner oefening
       /* Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("your username is "  + userName);*/

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name, age and salary");

        String name = myObj.nextLine();

        int age = myObj.nextInt();
        double salary = myObj.nextDouble();




        //Loops
        //De for loop

        for (int index = 0; index < 15; index++){
            System.out.println("This is a for loop, with index : " + index );
        }


    }


    }



