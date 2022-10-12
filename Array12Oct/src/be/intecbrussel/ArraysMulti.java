package be.intecbrussel;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysMulti {
    public static void main(String[] args) {

        // Arrays - Schrijf een programma dat 10 int's vraagt aan een gebruiker en deze in een array plaatst. Print deze array dan uit op het scherm.

        System.out.println("Array Exercise 1 - Enter 10 integers : ");
        Scanner myInt = new Scanner(System.in);
        System.out.print("Enter 10 integers : ");

        int[] myArr = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myInt.nextInt();
        }

        for (int i = 0; i < myArr.length; i++) {
            System.out.print(" " + myArr[i]);
        }

        //Zorg dat je 10 inputs krijgt van een user en sla deze op in een array. Daarna kopieer je deze elementenin een andere array in reverse order.

        System.out.println("\n");
        System.out.println("Array Exercise 2 - Reverse the numbers : ");
        int[] myReverse = Arrays.copyOf(myArr, 10);
        for (int i = myReverse.length - 1; i >= 0; i--) {
            System.out.print(" " + myReverse[i]);
        }

        //Schrijf een programma dat de duplicaten vindt in een array int values.

        System.out.println("\n");
        System.out.println("Array Exercise 3 - Get the duplicated numbers ");

        int[] numbers = {12, 3, 5, 5, 7, 8, 8, 10};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == (numbers[j])) {
                    System.out.println(numbers[j]);
                }
            }
        }

        //Schrijf een programma dat de even en oneven nummers optelt van een int array.
        System.out.println("\n");
        System.out.println("Array Exercise 4 - Sum odd numbers ");
        int[] evenOdd = {1, 3, 5, 4, 6, 8, 4, 11};
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < evenOdd.length; i++) {
            if (evenOdd[i] % 2 == 0) {
                evenSum = evenSum + evenOdd[i];
            } else {
                oddSum = oddSum + evenOdd[i];
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);

        // Print een deze array uit zonder loop

        System.out.println("\n");
        System.out.print("Array extra Exercise 1 - Print without loop : ");
        int[] intArray = {2, 5, 46, 12, 34};
        System.out.print(" " + Arrays.toString(intArray));

        // Schrijf een programma om een nummer array en een String array te sorteren en uit te printen.

        System.out.println("\n");
        System.out.println("Array extra Exercise 2 - Sort number array : ");
        int[] myArray = {90, 23, 5, 109, 12, 22, 67, 34};
        for (int i = 0; i < myArray.length; i++)
            System.out.print(" " + myArray[i]);
        Arrays.sort(myArray);

        System.out.println("\n");
        System.out.println("Numbers of array are sorted : ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(" " + myArray[i]);
        }

        System.out.println("\n");
        System.out.println("String of array are sorted : ");

        String[] sortText = {"hello", "java", "developers"};
        Arrays.sort(sortText);
        System.out.println("The original message is : hello java developers");
        System.out.println("The new message is : ");
        System.out.println(Arrays.toString(sortText));

    }
}
