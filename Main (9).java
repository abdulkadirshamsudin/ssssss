// 1️⃣ Interface: Defines basic device behaviors
interface Device {
    void turnOn();  // Power on the device
    void turnOff(); // Power off the device
}

// 2️⃣ Abstract Class: Represents a general computer
abstract class Computer implements Device {
    String brand;

    // Constructor
    Computer(String brand) {
        this.brand = brand;
    }

    // Concrete method: A shared feature for all computers
    void runDiagnostics() {
        System.out.println(brand + " is running system diagnostics.");
    }
}

// 3️⃣ Concrete Class: A specific type of computer (Laptop)
class Laptop extends Computer {
    
    // Constructor
    Laptop(String brand) {
        super(brand);
    }

    // Implementing turnOn() method from Device interface
    @Override
    public void turnOn() {
        System.out.println(brand + " laptop is powering on.");
    }

    // Implementing turnOff() method from Device interface
    @Override
    public void turnOff() {
        System.out.println(brand + " laptop is shutting down.");
    }
}

// 4️⃣ Testing the implementation
public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell"); // Creating a laptop object

        myLaptop.runDiagnostics(); // Inherited from Computer
        myLaptop.turnOn();         // Implemented from Device interface
        myLaptop.turnOff();        // Implemented from Device interface
    }
}
