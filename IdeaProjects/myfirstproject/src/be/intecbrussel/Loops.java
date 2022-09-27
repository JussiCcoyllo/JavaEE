package be.intecbrussel;

public class Loops {
    public static void main(String[] args) {

        //programme schrijven dat controleert of variable even of oneven is;
        int pair = 345;

        if (pair % 2 == 0) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }

        // de even number uitprint tussen 0 en 100

       /* for (int imp = 2; imp < 100; imp += 2) {
            System.out.println(imp);
        }*/

        // schrijf een programma dat de eerste 5 getallen uitprint.
        // De som van deze getallen uitprint en het gemiddelden

       /* int num;
        for (num = 1; num < 6; num++) {
            System.out.println(num);

        }
        int x = 1;
        int sum = 0;

        while (x <= 5) {
            sum = sum + x;
            x++;

        }
        System.out.println(sum);
        double avg = sum / 5;
        System.out.println(avg);*/

        //andere methode
       /* int sum1 = 0;

        for (int index = 0; index < +5; index++) {
            sum1 = sum1 + index;
        }
        double avg1 = sum1 / 5;

        System.out.println("sum " + sum + " average " + avg1);*/

        //oefeningen samenvatting branchin

        //1
        /*for (int seven = 100; seven> 0; seven-- ){
           if (seven % 7 == 0) {
               System.out.println(seven);
           }*/

        //2
        int i = 101;

        while (i > 50) {
            i--;
            System.out.println(i);
        }

        //3
        //System.out.println("Jussi");
        int age = 0;
        do {
            System.out.println("Jussi " + age++);
        }
        while (age < 47);

    }


       }










