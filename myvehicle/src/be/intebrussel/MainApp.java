package be.intebrussel;

public class MainApp {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setColour("Red");
        System.out.println(myCar.getColour());


        Car myDifCar = new Car( "blue");
        System.out.println(myDifCar);
        myDifCar.messageCar();

        Car myNewCar = new Car();
        myNewCar.setColour("white");
        myNewCar.setSpeed(100);

        System.out.println(myNewCar.getTopSpeed());
    }


}
