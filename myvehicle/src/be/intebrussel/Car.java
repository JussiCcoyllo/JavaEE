package be.intebrussel;

public class Car {

    //properties
    private String colour;
    private double speed;

    //constructor no args
    public Car() {

    }

    public Car(String colour) {this.colour=colour;}

    //parameter constructor, click right/generator/constructor
    public Car(String colour, double speed) {
        this.colour = colour;
        this.speed = speed;
    }

    //getter and setters, click right/generator/getters and setters

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //eigen methode
    public void messageCar(){
        System.out.println("Car is ready");
    }
    public double getTopSpeed() {
        return speed * 3;
    }

    @Override
    public String toString() {
        return "Car{" + "colour=" + colour + '\'' + ", speed=" + speed + '}';
    }
}





