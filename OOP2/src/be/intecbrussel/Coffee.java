package be.intecbrussel;

public class Coffee {
    //properties
    private int temperature;
    private String coffeeType;
    private static int coffeeCount;

    private static int blackCoffeeCount = 0;
    private static int romanoCoffeeCount = 0;
    private static int irishCoffeeCount = 0;

    //maak het mogelijk om op te vragen hoeveel coffee's van ieder type zijn gemaakt: black coffee, cffee romano, irish coffe.

    //constructor
    public Coffee(){
        this("arabica"); //constructor chaining,
    }
    public Coffee(String beans) {
        System.out.println("black coffee created");
        temperature = 80;
        coffeeType = "Black coffee";
        coffeeCount++;
        blackCoffeeCount++;
    }
    public Coffee(String beans, boolean lemon) {
        System.out.println("Coffee romano created");
        temperature = 75;
        coffeeType = "Coffee romano";
        coffeeCount++;
        romanoCoffeeCount++;
    }

    public Coffee(String beans, boolean whisky, boolean cream) {
        System.out.println("Irish coffee created");
        temperature = 60;
        coffeeType = "Irish coffee";
        coffeeCount++;
        irishCoffeeCount++;
    }

    //getters ans setters

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public static int getCoffeeCount() {
        return coffeeCount;
    }

    public static int getBlackCoffeeCount() {
        return blackCoffeeCount;
    }

    public static int getRomanoCoffeeCount() {
        return romanoCoffeeCount;
    }

    public static int getIrishCoffeeCount() {
        return irishCoffeeCount;
    }

//    public String sip(){
//        return "MMMMMMMmmmmm";
//    }
    public void sip(){
        System.out.println("Mmmmmmmm");
    }
}
