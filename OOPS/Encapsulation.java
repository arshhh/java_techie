package OOPS;

abstract class Car1{
    public abstract void startEngine();
    public abstract void stopEngine();
    public boolean getBatteryStatus(){ return true; }
}

class MotorCar extends Car1{

    @Override
    public void startEngine() {
        getBatteryStatus();
        System.out.println(getBatteryStatus()+" battery start");
    }

    @Override
    public void stopEngine() {
        System.out.println("stopped");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Car1 car = new MotorCar();
        car.startEngine();
        car.stopEngine();
    }
}
