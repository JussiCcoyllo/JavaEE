


package be.intecbrussel;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Car {
    Scanner scanner;
    Random random;
    private String colour;
    private int maxSpeed;
    private int horsePower;
    private int currentSpeed;
    private int repairCost;
    private static int carsCreated = 0;
    private boolean lights;
    private String driver;
    private String licensePlate;

    public Car() {
        this("white", 120, 150);
    }

    public Car(String colour, int maxSpeed, int horsePower) {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.repairCost = this.random.nextInt(201) + 100;
        this.lights = false;
        this.driver = "unkown";
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        ++carsCreated;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getRepairCost() {
        return this.repairCost;
    }

    public static int getCarsCreated() {
        return carsCreated;
    }

    public boolean isLights() {
        return this.lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void speedUp() {
        if (this.currentSpeed < this.maxSpeed) {
            int var10003 = this.currentSpeed + 5;
            System.out.println("The car speeds up by 5km/h to: " + (this.currentSpeed = var10003) + "km/h");
        } else {
            System.out.println("Car already at max speed, your speed remains: " + this.currentSpeed + "km/h");
        }

    }

    public void slowDown() {
        if (this.currentSpeed > 0) {
            int var10003 = this.currentSpeed - 5;
            System.out.println("The car slows down by 5km/h to: " + (this.currentSpeed = var10003) + "km/h");
        } else {
            System.out.println("Car already at 0, can't slow down further");
        }

    }

    public void repaint() {
        System.out.println("Please choose a new colour for your car");
        this.setColour(this.scanner.nextLine().toLowerCase());
    }

    public void repair() {
        System.out.print("repair cost is " + this.repairCost);
        System.out.println();
    }

    public void toggleLights() {
        if (this.lights) {
            this.setLights(false);
            System.out.println("The lights are off");
        } else {
            this.setLights(true);
            System.out.println("The lights are on");
        }

    }

    public void assignDriver() {
        System.out.println("Please enter the name of the drive");

        while(true) {
            this.setDriver(this.scanner.nextLine());
            if (!this.driver.trim().isBlank() && this.driver.length() >= 5) {
                System.out.println("The driver's name is " + this.driver);
                return;
            }

            System.out.println("Niet toegestaan");
            System.out.println("Please re-enter the name of the driver");
        }
    }

    public void generateLicensePlate() {
        String var10001 = this.driver.toUpperCase(Locale.ROOT).substring(0, 3);
        this.setLicensePlate(var10001 + "-" + (this.random.nextInt(900) + 100));
        System.out.println(this.licensePlate);
    }

    public String toString() {
        return "Car{, colour='" + this.colour + "', maxSpeed=" + this.maxSpeed + ", horsePower=" + this.horsePower + ", currentSpeed=" + this.currentSpeed + ", repairCost=" + this.repairCost + "}";
    }
}
