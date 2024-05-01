interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Motorcycle implements Vehicle {
    
    public void start() {
        System.out.println("Motorcycle started.");
    }

  
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

public class P3_3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        myCar.start();
        myCar.stop();

        myMotorcycle.start();
        myMotorcycle.stop();
    }
}
