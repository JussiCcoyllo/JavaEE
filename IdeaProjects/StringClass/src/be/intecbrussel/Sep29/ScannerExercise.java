package be.intecbrussel;
import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {

//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Enter username");
//
//        String username = myScanner.nextLine();
//        System.out.println("My username is: "+ username.toUpperCase());
//
//        Scanner myCode = new Scanner(System.in);
//        System.out.println("Enter your code");
//
//        int code = myCode.nextInt();
//        System.out.println("code is " + code);
//
//
//        long pass = myScanner.nextLong();
//        //... to complet

//        int sum = 0;
//        while(myScanner.hasNextInt()) {
//            int number = myScanner.nextInt();
//            sum += number;
//        }
//        System.out.println(sum);
//
//        double sal = 100;
//        while (myScanner.hasNextInt()){
//            double total = myScanner.nextDouble();
//            sal+=total;
//        }
//        System.out.println(sal);

        //to complete with more exercises

        //Samenvatting

        //1
//        Scanner myData = new Scanner(System.in);
//
//        System.out.println("Enter your name");
//        String name = myData.nextLine();
//
//        System.out.println("Enter your n° telephone");
//        int telephone = myData.nextInt();
//
//        System.out.println("name is: " + name);
//        System.out.println("telephone is: " + telephone);

        //2

        Scanner firstNum = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        double num1 = firstNum.nextDouble();

        System.out.println("Enter a second ê®number");
        Scanner secNum = new Scanner(System.in);
        double num2 = secNum.nextDouble();

        if (num1 > num2 ){
            System.out.println("the number " + num1 + " is greater");
        } else {
            System.out.println("the number " + num2 + " is greater");
        }
    }
}
