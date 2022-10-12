package be.intecbrussel;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {

        Search search = new Search("hi");


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a text : ");
        String myWord = myScanner.nextLine();

        search.setMyWord(myWord);
        search.countVowels();


    }
}
