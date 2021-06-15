package factory.method;

import factory.simple.CarFactory;

public class Consumer {
    public static void main(String[] args) {

        Car car = new WuliNGFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
        Car car3 = new MoBaiFactory().getCar();

        car.name();
        car2.name();
        car3.name();

    }
}
