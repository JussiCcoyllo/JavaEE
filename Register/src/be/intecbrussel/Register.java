package be.intecbrussel;
import java.util.Scanner;

public class Register {

    Scanner scanner = new Scanner(System.in);

    //properties
    private int breadSold = 0;
    private int milkSold = 0;
    private int appleSold = 0;
    private int baguetteSold = 0;
    private int coffeeSold = 0;

    //constructor
    public Register(){

    }
    //methods
    public void open(){
        while (true){;
            System.out.println("Please enter the product you want to buy: ");
            String input = scanner.next();

            if(input.toLowerCase().equals("stop")){
                break;
            }
            productSold(input);
        }

    }
    public void productSold(String product) {
        switch (product.toLowerCase()) {
            case "bread":
                if (breadSold < 10) {
                    breadSold++;
                }else {
                    System.out.println("Product is sold out");
                }
                break;
                case "milk":
                    if (milkSold < 10) {
                        milkSold++;
                    }else {
                        System.out.println("Product is sold out");
                    }
                break;
            case "coffee":
                if (coffeeSold < 10) {
                    coffeeSold++;
                }else {
                    System.out.println("Product is sold out");
                }
                coffeeSold++;
                break;
            case "apple":
                if (appleSold < 10) {
                    appleSold++;
                }else {
                    System.out.println("Product is sold out");
                }

                break;
            case "baguette":
                if (baguetteSold < 10) {
                    baguetteSold++;
                }else {
                    System.out.println("Product is sold out");
                }

                break;
            default:
                System.out.println("product sold out");
                break;

        }
    }
    public double calculateTotal() {
        double totalPrice= 0;

        totalPrice += 2.5 * breadSold;
        totalPrice += 1.25 * milkSold;
        totalPrice += 0.50 * appleSold;
        totalPrice += 0.75 * baguetteSold;
        totalPrice += 3.00 * coffeeSold;

        return totalPrice;
    }
    public StringBuilder getSoldProducts(){
        StringBuilder productSold = new StringBuilder();

        productSold.append(" bread " + breadSold);
        productSold.append(" milk " + milkSold);
        productSold.append(" apple " + appleSold);
        productSold.append(" baguette " + baguetteSold);
        productSold.append(" coffee " + coffeeSold);

        return productSold;
    }

//    private double bread;
//    private double milk;
//    private double apple;
//    private double baguette;
//    private double coffee;
//
//    //constructor
//    public Register() {
//
//    }
//
//    public Register(double bread, double milk, double apple, double baguette, double coffee) {
//        this.bread = bread;
//        this.milk = milk;
//        this.apple = apple;
//        this.baguette = baguette;
//        this.coffee = coffee;
//    }
//
//    //getters and setters
//
//    public double getBread() {
//        return bread;
//    }
//
//    public void setBread(double bread) {
//        this.bread = bread;
//    }
//
//    public double getMilk() {
//        return milk;
//    }
//
//    public void setMilk(double milk) {
//        this.milk = milk;
//    }
//
//    public double getApple() {
//        return apple;
//    }
//
//    public void setApple(double apple) {
//        this.apple = apple;
//    }
//
//    public double getBaguette() {
//        return baguette;
//    }
//
//    public void setBaguette(double baguette) {
//        this.baguette = baguette;
//    }
//
//    public double getCoffee() {
//        return coffee;
//    }
//
//    public void setCoffee(double coffee) {
//        this.coffee = coffee;
//    }
//
//    //eigen method
//
//    public double getRegister() {
//        return apple + coffee + baguette + milk + bread;
//    }
//
}
