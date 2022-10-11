package be.intecbrussel;

import java.awt.*;

public class AutoApp {
    public static void main(String[] args) {
        Car car = new Car("white",120, 150);

        Car car1 = new Car("violet", 120, 150);
        Car car2 = new Car("green", 70, 150);
        Car car3 = new Car("yellow", 160, 200);

        System.out.println("Car 1 : \ncolor : " + car1.getColor() + "\nSpeed : " + car1.getMaxSpeed() + "\nHorse power : " + car1.getHousePower());
        System.out.println("Car 2 : \ncolor : " + car2.getColor() + "\nSpeed : " + car2.getMaxSpeed() + "\nHorse power : " + car2.getHousePower());
        System.out.println("Car 3 : \ncolor : " + car3.getColor() + "\nSpeed : " + car3.getMaxSpeed() + "\nHorse power : " + car3.getHousePower());

        car.setCurrentSpeed();
        car.SpeedUp();
        System.out.println(car.getCurrentSpeed());
        car.SlowDown();
        System.out.println(car.getCurrentSpeed());

        car1.rePaint();
        car1.repair();

        car.count();
        car.ligthsOn();

        car1.assignDriver();
        car.licensePlate();
    }

}
