package be.intecbrussel;
import java.util.Random;
import java.util.Scanner;

public class BasisProgrammeren {

    public static void main(String[] args) {

        // 1
        System.out.println("Exercise 1");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myScanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is even odd");
        }

        // 2

        System.out.println("Exercise 2");
        Scanner myData = new Scanner(System.in);

        System.out.println("Enter the radio ");
        int radio = myData.nextInt();

        System.out.println("Enter the length ");
        int length = myData.nextInt();

        double area = radio * radio * Math.PI * length;
        System.out.println("The area is : " + area + " cm");

        double volume = area * length;
        System.out.println("The volume is : " + volume + " cm3");


        //4

        System.out.println("Exercise 4");
        int nombre = 899630515;
        if (nombre % 5 == 0 && nombre % 6 ==0) {
            System.out.println("The number is divisible by 5 and 6");
        } else if (nombre % 5 == 0) {
            System.out.println("The number is divisible by 5 ");
        } else {
            System.out.println("The number is divisible by 6 ");
        }

        //5
        System.out.println("Exercise 5");

        int min = 0;
        int max = 400;

        int stock1 = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Stock 1 is : " + stock1);
        int stock2 = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Stock 2 is : " + stock2);
        int totalStock = stock1 + stock2;

        if (totalStock > 750) {
            System.out.println("You gonna married!");
        } else if (totalStock > 300) {
            System.out.println("You must by her an iPad");
        } else if (totalStock > 100) {
            System.out.println("Gets dinner with your love");
        } else {
            System.out.println("Sorry, you are not gonna married");
        }

        //6
        System.out.println("Exercise 6");
        {
            int i,j,count=0;

            for (i=20; i<=100; i++)
            {
                for(j=1; j<=i/2; j++)
                {
                    if(i % j == 0)
                        count++;
                }
                if(count == 1)
                    System.out.println("Prime number " + i);
                count=0;
            }
        }

        //7
        System.out.println("Exercise 7");
        int age = 20;
        int riskLevel = 0;

        if(age > 65) {
            riskLevel+=3;
            System.out.println("Risk level : " + riskLevel);

        } else if (age > 45) {
            riskLevel+=2;
            System.out.println("Risk level : " + riskLevel);

        } else if (age > 25) {
            riskLevel+=1;
            System.out.println("Risk level : " + riskLevel);

        } else {

            System.out.println("Risk level : " + riskLevel);

        }

        switch (riskLevel){
            case 0:
                System.out.println("Go home");
                break;
            case 1:
                System.out.println("Any antecedents");
                break;
            case 2:
                System.out.println("Let’s take your temperature first");
                break;
            default:
                System.out.println("Please take this vaccine now!");
                break;
            }

        //8
        System.out.println("Exercise 8");
        int sum = 0;

        for (int i = 0; i <=100; i++){
             sum += i;
        }
        System.out.println(sum);

        //9
        System.out.println("Exercise 9");
        int brut = 1850;
        double net;

        if (brut > 3000){
            net = brut * 62/100;
        } else if (brut > 2000) {
            net = brut * 65/100;
        } else {
            net = brut * 73/100;
        }
        System.out.println(net);

    }
}


