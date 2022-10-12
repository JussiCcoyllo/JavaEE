package be.intecbrussel;
import java.util.Scanner;

public class SwitchMorning {
    public static void main(String[] args) {
        //1
        //if statement
//        Scanner myTime = new Scanner(System.in);
//        System.out.println("Enter the hour : ");
//        int time = myTime.nextInt();
//
//        int moment = 0;
//
//        if(time >= 0 && time <= 6) {
//           moment+=1;
//        } else if (time > 6 && time <= 12){
//            moment+=2;
//        } else if (time > 12 && time <= 18) {
//            moment+=3;
//        } else if(time > 18 && time <= 24) {
//            moment+=4;
//        } else {
//            moment+=5;
//        }
//
//        //switch statement
//
//        switch (moment){
//            case 1 :
//                System.out.println("Night");
//                break;
//            case 2:
//                System.out.println("Morning");
//                break;
//            case 3:
//                System.out.println("Afternoon");
//                break;
//            case 4:
//                System.out.println("Evening");
//                break;
//            default:
//                System.out.println("Nope valid input");
//                break;
//            }
//
//    //2
//        int num1 = 4;
//        int num2 = 5;
//        int operator = 1;
//        switch (operator){
//            case 1 :
//                operator = num1 + num2;
//                System.out.println(operator);
//            case 2 :
//                operator = num1 - num2;
//                System.out.println(operator);
//            case 3 :
//                operator = num1 * num2;
//                System.out.println(operator);
//            case 4 :
//                operator = num1 / num2;
//                System.out.println(operator);
//            default:
//                operator = num1 % num2;
//                System.out.println(operator);
//        }

        //Check answer with teacher
//         String day ="monday";
//            switch (day) {
//                case "saturday", "sunday" -> System.out.println("night");
//                case "monday" -> System.out.println("6qm");
//                default -> System.out.println("time to sleep");
//            }


        //Declaring String variable
//        String levelString="Expert";
//        int level=0;
//        //Using String in Switch expression
//        switch(levelString){
//            //Using String Literal in Switch case
//            case "Beginner": level=1;
//                break;
//            case "Intermediate": level=2;
//                break;
//            case "Expert": level=3;
//                break;
//            default: level=0;
//                break;
//        }
//        System.out.println("Your Level is: "+level);
//        System.out.println("Your Level is: "+level);

        Integer age = 15;
        switch (age)
        {
            case (16):
                System.out.println("You are under 18.");
                break;
            case (18):
                System.out.println("You are eligible for vote.");
                break;
            case (65):
                System.out.println("You are senior citizen.");
                break;
            default:
                System.out.println("Please give the valid age.");
                break;
        }
    }
}
