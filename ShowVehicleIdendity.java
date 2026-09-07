abstract class Vehicle {
    String vehicleNumber;
    String brand;

    Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    abstract void startEngine();

    final void showVehicleIdentity() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    void startEngine() {
        System.out.println("Car engine started using key ignition.");
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    void startEngine() {
        System.out.println("Bike engine started using self-start.");
    }
}

class Main {
    public static void main(String[] args) {

        Car car = new Car("KA01AB1234", "Toyota");
        car.showVehicleIdentity();
        car.startEngine();

        System.out.println();

        Bike bike = new Bike("KA05XY5678", "Honda");
        bike.showVehicleIdentity();
        bike.startEngine();
    }
}