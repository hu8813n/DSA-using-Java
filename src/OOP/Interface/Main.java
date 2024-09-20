package OOP.Interface;

import OOP.Interface.SeprateClass.NiceCar;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.acc();
//        car.brake();
//        car.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

        car.upgradeEngine();
        car.start();
    }
}
