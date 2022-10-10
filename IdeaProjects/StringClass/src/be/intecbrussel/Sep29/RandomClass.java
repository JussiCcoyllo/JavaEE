package be.intecbrussel;
import java.util.Random;
import java.util.Scanner;

public class RandomClass {

    public static void main(String[] args) {
    //1
        Random  random = new Random();

    //  int randomNum = random.nextInt();
        for (int r=0; r<5; r++){
            System.out.println(random.nextInt());
        }
    //2
        for (int r=0; r<6; r++){
            System.out.println(random.nextInt(45));
        }


    //3
            Scanner myGuess = new Scanner(System.in);
            System.out.println("Guess the number : ");
            int numberGamer = myGuess.nextInt();
            int resultMath = random.nextInt();

        for (int r=0; r<5; r++){
            if (numberGamer == resultMath){
                System.out.println("Perfect");
            }
            System.out.println(random.nextInt());
        }

        //Methode equal String
        String sentence = "I love you!";
        String sentence2 = "I love you!";
        System.out.println(sentence.equals(sentence2));



//        double randomDouble = random.nextDouble();
//        System.out.println(randomDouble);
//
//        boolean randomBoo = random.nextBoolean();
//        System.out.println(randomBoo);

//        long randomLong = random.nextLong();




    }
}
