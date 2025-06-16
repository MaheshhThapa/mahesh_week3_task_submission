class Vehicle {
    int plateNumber;
    double baseRate;

    Vehicle(int plateNumber,double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    double calculateRental(int days) {
        return baseRate;
    }
}

class Car extends Vehicle {
    Car(int plateNumber, double baseRate){
        super(plateNumber, baseRate);
    }

    @Override
    double calculateRental(int days){
        return baseRate * days;
    }
}

class Truck extends Vehicle {
    double loadFee;
    Truck(int plateNumber, double baseRate, double loadFee){
        super(plateNumber, baseRate);
        this.loadFee = loadFee;
    }
    @Override
    double calculateRental(int days) {
        return baseRate * days + loadFee;
    }
}

class Bike extends Vehicle {
    Bike(int plateNumber, double baseRate){
        super(plateNumber, baseRate);
    }

    @Override
    double calculateRental(int days) {
        return baseRate;
    } 
}
public class VehicleRental {
    public static void main(String[] args){
        Car toy = new Car(1234, 4000);
        Truck notToy = new Truck(1000,10000,5000);
        Bike duke = new Bike(500, 5500);

        System.out.println("Total rent of car:Rs." + toy.calculateRental(5));
        System.out.println("Total rent of truck:Rs." + notToy.calculateRental(7));
        System.out.println("Total rent of bike:Rs." + duke.calculateRental(10));
    }
    
}
