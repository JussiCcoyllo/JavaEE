package be.intecbrussel;
import javax.imageio.ImageWriteParam;
import java.util.Random;
import java.util.Scanner;

public class Car {

    Scanner myScanner = new Scanner(System.in);
    private String color;
    private int maxSpeed;
    private int housePower;
    int currentSpeed = 0;
    private double priceRepair=100;
    private int countCar;
    private boolean ligthsOn = false;
    private String driverName = "unknown";


    public Car(String color, int maxSpeed, int housePower){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.housePower = housePower;
        this.currentSpeed = currentSpeed;
        this.priceRepair = priceRepair;
        this.countCar =countCar;
        this.driverName = driverName;
    }

    //getters

    public String getColor() {
        return this.color;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getHousePower() {
        return this.housePower;
    }
    //methode

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed() {
        System.out.println("Enter your speed");
        currentSpeed = myScanner.nextInt();
        if (currentSpeed < maxSpeed && currentSpeed > 0){
            this.currentSpeed = currentSpeed;
        }else {
            System.out.println("Speed not authorised");
        }
    }
    public void SpeedUp() {
        if (currentSpeed < maxSpeed && currentSpeed > 0) {
            currentSpeed += 5;
        }else {
            System.out.println("Speed not authorised");
        }
    }
    public void SlowDown() {
        if (currentSpeed > maxSpeed && currentSpeed > 0) {
            currentSpeed -= 5;

        } else {
            System.out.println("Speed not authorised");
        }
    }
    public void rePaint(){
        switch (this.color) {
            case "green" :
               color = "violet";
            case "yellow":
                color ="green";
            case "white":
                color= "violet";
            default:
                color = "white";
            }
        System.out.println("The new color for your car is: " + color );
        }

    public void repair() {

        double priceRepair =  Math.random() * 300;
        int priceTotal = (int) priceRepair;
        System.out.println("The repair price is " + priceTotal);

    }

    public void count(){
        ++countCar;
        System.out.println("There were "+ countCar+ " cars ");

    }

    @Override
    public  String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", housePower=" + housePower +
                ", currentSpeed=" + currentSpeed +
                ", priceRepair=" + priceRepair +
                '}';
    }

    public void ligthsOn() {
        if (ligthsOn == true) {
            System.out.println("Your lights are on");
        } else {
            System.out.println("Your lights are off");
        }
    }

    public void assignDriver(){
        Scanner myDriver = new Scanner(System.in);
        System.out.println("enter a driver name");
        String driver = myDriver.nextLine();

        if(driver.length() >= 5){
            System.out.println("your driver is " + driver);
        } else {
            System.out.println("Not allowed");
        }
    }

    public void licensePlate(){
        int alpha1 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int alpha2 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int alpha3 = 'A' + (int)(Math.random() * ('Z' - 'A'));

        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);


        System.out.println("" + (char)(alpha1) + ((char)(alpha2)) +
                ((char)(alpha3)) + digit1 + digit2 + digit3 );
    }
}
