package be.intecbrussel;

public class Square {
    //properties
    private double side;

    //constructors

    public Square() {
        messageCreation();
    }

    public Square(double side) {
        this.side = side;
        messageCreation();
    }
    //getters and setters

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    //eigen methodes
    public void messageCreation(){
        System.out.println("square created");
    }

    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return side + side + side + side;
    }
}
