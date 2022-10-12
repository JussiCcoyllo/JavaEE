package be.intecbrussel;

public class Operators {

    public static void main(String[]  args) {

        // Operators oefeningen
        int myNumber = 20;

        myNumber++;
        ++myNumber;

        System.out.println(++myNumber); //execute avant
        System.out.println(myNumber++); //execute après avoir imprimé

        System.out.println(myNumber);

        char first = 'a';

        long a = 10000000L;
        long b = -2_000_000L;

        System.out.println(a);
        System.out.println(b);

        int A = 5;
        int B = 10;

        boolean equal = (A == B);
        boolean notEqual = (A!=B);
        boolean biggerThan = (A>B);
        boolean smallerThan = (A<B);
        boolean biggerEqual = (A>=B);
        boolean smallerEqual = (A<=B);

        System.out.println(equal);
        System.out.println(notEqual);
        System.out.println(biggerThan);
        System.out.println(smallerThan);
        System.out.println(biggerEqual);
        System.out.println(smallerEqual);


    }
}
