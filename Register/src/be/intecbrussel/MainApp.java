package be.intecbrussel;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Register register = new Register();
        register.open();
        System.out.println("Total price : " + register.calculateTotal());
        ;
        System.out.println(register.getSoldProducts());

//        System.out.println("Enter a product to buy");
//        Scanner myBought = new Scanner(System.in);
//        String bougth = myBought.nextLine();
//
//        switch (bougth) {
//            case "Milk":
//                break;
//            case "Bread":
//                break;
//            case "Coffee":
//                break;
//            case "Apple":
//                break;
//            case "Baguette":
//                break;
//            default:
//                System.out.println("Not in stock");
//                break;
//        }
//
//        Register register = new Register();
//        register.setBread(2.50);
//        register.setMilk(1.25);
//        register.setCoffee(3.0);
//        register.setBaguette(0.75);
//        register.setApple(0.50);
//
//        System.out.println(register.getRegister());
    }

}
