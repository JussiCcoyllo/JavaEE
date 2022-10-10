//package be.intecbrussel;
//
//public class AutoApp {
//    public static void main(String[] args) {
//
//       Car car = new Car();
//
//        Car car1 = new Car("violet", 60,120);
//        Car car2 = new Car("green",70, 150);
//        Car car3 = new Car("yellow", 160, 200);
//
//
//        System.out.println("Car 1 is : " + car1.getColor());
//        System.out.println("Car 2 is : " + car2.getColor() + ", its speed is : " + car2.getMaxSpeed());
//        System.out.println("Car 3 is : " + car3.getColor() + ", its speed is : " + car3.getMaxSpeed() + ", its horse power is : " + car3.getHorsePower());
//
//        car1.speedEnter();
//
//        car1.speedUp();
////        car.paint();
//
//        car1.repair();
//
//        car.lightsCar();
//
//    }
//}



//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package be.intecbrussel;

public class AutoApp {
    public AutoApp() {
    }

    public static void main(String[] args) {
        System.out.println("deel 1 & 2");
        System.out.println();
        Car car1 = new Car("purple", 120, 150);
        Car car2 = new Car("green", 70, 150);
        Car car3 = new Car("yellow", 160, 200);
        Car car4 = new Car();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println();
        System.out.println("deel3");
        System.out.println();
        car1.setCurrentSpeed(115);
        car1.speedUp();
        car1.speedUp();
        car1.setCurrentSpeed(5);
        car1.slowDown();
        car1.slowDown();
        System.out.println(car1.getColour());
        car1.repaint();
        System.out.println(car1.getColour());
        car1.repair();
        System.out.println();
        System.out.println("deel8");
        System.out.println();
        car1.assignDriver();
        System.out.println();
        System.out.println("deel9");
        System.out.println();
        car1.generateLicensePlate();
        System.out.println(car1.getLicensePlate());
    }
}
