package be.intecbrussel;

public class Rectangle {
    //properties
    private double length;
    private double width;
    private static int counter = 0;

    //constructors
    public Rectangle(){
//        messageCreation();
        counter++;
    }
    public Rectangle(double width){
        this.width = width;
    }
    public Rectangle(double length, double width) {

//        this.length = length;
//        this.width = width;
//        messageCreation();
        setLength(length);
        setWidth(width);
        counter++;
    }

    //getters and setters

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;

        if (length <= 0 || length == width) {
            System.out.println("Impossible");
            System.exit(-1);
        } else {
            this.width = width;
        }

    }

    public static int getCounter() {
        return counter;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //eigen methods
    public void messageCreation(){
        System.out.println("Rectangle created");
    }
    public double getArea() {
        return width * length;
    }
    public int getArea(int width, int length){
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
