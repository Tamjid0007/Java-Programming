class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
       void start() {
        System.out.println("Car is starting...");
    }
}

public class P3_4 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();  

        Car car = new Car();
        car.start();  
    }
}
