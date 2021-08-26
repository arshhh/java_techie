package OOPS;

interface Vehicle{
    public void startEngine();
    public void stopEngine();
}

class Car implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Engine Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stopped");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();
    }
}


