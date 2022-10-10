package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee("arabica");
        Coffee coffee2 = new Coffee("robusta");
        Coffee coffee3 = new Coffee("arabica", true);
        Coffee coffee4 = new Coffee("Irish", true, true);
        Coffee coffee5 = new Coffee();

        //get temperatures
        System.out.println("coffee1 is of type " + coffee1.getCoffeeType() + " temperature: " + coffee1.getTemperature());
        System.out.println("1 hour later ");
        coffee1.setTemperature(40);
        System.out.println("coffee1 is of type " + coffee1.getCoffeeType()  + " temperature: " + coffee1.getTemperature());

        System.out.println("coffee2 is of type " + coffee2.getCoffeeType() + " temperature: " + coffee2.getTemperature());
        System.out.println("coffee3 is of type " + coffee3.getCoffeeType() + " temperature: " + coffee3.getTemperature());
        System.out.println("coffee4 is of type " + coffee4.getCoffeeType() + " temperature: " + coffee4.getTemperature());
        System.out.println("coffee5 is of type " + coffee5.getCoffeeType() + " temperature: " + coffee5.getTemperature());

        System.out.println("coffee created : " + Coffee.getCoffeeCount());
        System.out.println("coffee created : " + coffee5.getCoffeeCount());
        System.out.println("black coffees created : " + Coffee.getBlackCoffeeCount());
        System.out.println("romano coffees created : " + Coffee.getRomanoCoffeeCount());
        System.out.println("irish coffees created : " + Coffee.getIrishCoffeeCount());

        coffee1.sip();
        coffee2.sip();
//        System.out.println(coffee1.sip());



    }

}
