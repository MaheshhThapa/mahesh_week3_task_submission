class Device {
    String deviceName;
    Device(String deviceName){
        this.deviceName = deviceName;
    }
    void operate() {
        System.out.println("Device is on..");

    }
}

class Light extends Device{
    Light(String deviceName){
        super(deviceName);
    }

    @Override
    void operate() {
        System.out.println(deviceName +"lights are on..");
    }
}

class Thermo extends Device{
    Thermo(String deviceName){
        super(deviceName);
    }

    @Override
    void operate() {
        System.out.println(deviceName +"temperature is set to 24 degrees..");
    }
}

class SecurityCamera extends Device{
    SecurityCamera(String deviceName){
        super(deviceName);
    }

    @Override
    void operate() {
        System.out.println(deviceName + "security camera is now recording..");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] home = new Device[3];
        home[0] = new Light("Kitchen lights");
        home[1] = new Thermo("Bedroom");
        home[2] = new SecurityCamera("Garage");

        home[0].operate();
        System.out.println();
        home[1].operate();
        System.out.println();
        home[2].operate();

    }
}
