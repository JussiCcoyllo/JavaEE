package be.intecbrussel;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class MyFirstArray {
    public static void main(String[] args) {

        int[] myArr = new int[5];

        myArr[0] = 10;
        myArr[1] = 20;
        myArr[4] = 5;
        System.out.println(myArr[3]);

        double[] myDouble = new double[4];
        myDouble[0] = 2.4;
        myDouble[1] = 3.6;
        myDouble[2] = 9.7;

        System.out.print(myDouble[0] + " ");
        System.out.print(myDouble[1] + " ");
        System.out.print(myDouble[2] + " ");

        boolean[] myBoolean = new boolean[2];
        myBoolean[0] = true;
        myBoolean[1] = false;
        System.out.println("\nBooleans : " + myBoolean[0] + " and " + myBoolean[1]);

        char[] myChar = new char[5];
        myChar[0] = 'j';
        myChar[1] = 'u';
        myChar[2] = 's';
        myChar[3] = 's';
        myChar[4] = 'i';
        System.out.println("My name is: "+ myChar[0] + myChar[1] + myChar[2]);

        String[] names = {"jhon", "joey"};
        System.out.println(names[0]);
        System.out.println(names.length);

        //for loops
        double[] numbers = {10.0, 45.0, 34.8, 50.7};
        for(double num:numbers){
            System.out.println(num);
        }
        //for each
        for(double elements: numbers){
            System.out.println(elements);
        }

        int[] numb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int index = 0; index < numb.length; index++) {
           sum = sum + numb[index];
        }
           System.out.println(sum);

        double[] deciNumb = {10.5, 20.8, 33.45};
        double sum1 = 0.0;

        for (int index = 0; index < deciNumb.length; index++) {
            sum1 = sum1 + deciNumb[index];
        }
        System.out.println(sum1);

        //oefening 1 : Met datatype van double en char.
        double myArray[] = {2.3, 4.6, 6.7};
        char myChar1[] = {'a', 'b', 'c'};
        System.out.println(myArray[0] + " " + myChar1[1]);

        //oefening 2 : Creëer een String array met 5 elementen.
        String[] myText = new String[5];
        myText[0]= "Hola";
        System.out.println(myText[0] + " length " + myText.length);

        //Schrijf een programma dat van de volgende array alle elementen optelt.

        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum2 = 0;
        for (int index = 0; index < my_array.length; index++) {
           sum2 = sum2 + my_array[index];
        }
           System.out.println(sum2);

//      Maak een string aan met deze zin “Maak van deze string een char array”.
//      Vervolgens gebruik je een methode om hier een char array van te maken. (Tip: bekijk de klas String). Tot slot print de char array uit.

        String stringToChar = "Maak this string a char array";
        char[] charArray = stringToChar.toCharArray();

        for(char ch:charArray) {
            System.out.print( ch + "|");
        }

//      Schrijf een programma om het gemiddelde van deze array elementen te berekenen.

        int[] numberS = {20, 30, 25, 35, -16, 60, -100};


//      Schrijf een programma en maak van de string waarde hierbeneden een char array met index.
        System.out.println("\n");
        String myString = "Char Array!";
        char[] text = myString.toCharArray();
        for(char ch:text){
            System.out.print(myString.indexOf(ch) + " = " + ch + " | ");
        }


//      Schrijf een programma om deze string arrays te wisselen van waarden.
        String[] firstArray = {"Intec", "is", "the", "best!"};
        String[] secondArray = {"C#", "is", "the", "worst!"};




    }

}
