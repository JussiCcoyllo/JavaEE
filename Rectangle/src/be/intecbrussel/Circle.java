package be.intecbrussel;

public class Circle {

    //properties
    private double radio;
    private double diameter;

    //constructors

    public Circle() {
        messageCreation();
    }

    public Circle(double radio, double diameter) {
        this.radio = radio;
        this.diameter = diameter;
        messageCreation();
    }
    //getters and setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    //eigen methodes
    public void messageCreation(){
        System.out.println("Circle created");
    }

    public double getArea(){
        return radio * radio * Math.PI;
    }
    public double getCircumference(){
        return diameter * Math.PI;
    }


}
