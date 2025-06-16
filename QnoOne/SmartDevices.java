                //SmartDevice
class SmartDevice {
    String brand;
    String model;

    SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
   
    public void turnOn() {
        System.out.println("The device is turning on.");
    }

    public void turnOff() {
        System.out.println("The device is turning off.");
    }
}

            //SmartPhone
class SmartPhone extends SmartDevice {
    
    SmartPhone(String brand, String model) {
        super(brand , model);
    }

    @Override
    public void turnOn() {
        System.out.println(brand +" "+ model +" is turning on.");
    }

    @Override
    public void turnOff() {
     System.out.println(brand +" "+ model +" is turning off.");
    }
}

            //SmartWatch
class SmartWatch extends SmartDevice {
    
    SmartWatch(String brand, String model) {
        super(brand , model);
    }

    @Override
    public void turnOn() {
        System.out.println(brand +" "+ model +" is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand +" "+ model +" is turning off.");
    }
}

 public class SmartDevices {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone("Apple", "Iphone 13");
        SmartWatch watch1 = new SmartWatch("Apple", "gen1");

        phone1.turnOn();
        phone1.turnOff();

        watch1.turnOn();
        watch1.turnOff();



    } 
}