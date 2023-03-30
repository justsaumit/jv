//LAB 9: Super , Static, final key words
//Q19. Write a java program to illustrate the keywords i)super ii)static iii)final

class Vehicle {
    
    static void hornsound() { // static method - that can be called on the class itself, rather than on an instance of the class.
        System.out.println("Beep beep!");
    }

    final String manufacturer; // final variable - to create a variable that cannot be changed once initialized
    
    Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    void printManufacturer() {
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class Car extends Vehicle {
    final int numWheels; // final variable
    
    Car(String manufacturer, int numWheels) {
        super(manufacturer); // call the superclass "Vehicle"'s constructor "manufacturer" to initialize variables.
        this.numWheels = numWheels;
    }
    
    void printNumWheels() {
        //numWheels=5; // wont work
        System.out.println("Number of wheels: " + numWheels);
    }
}

public class q19 {
    public static void main(String[] args) {
        Car car = new Car("Maruti", 4);
        Vehicle.hornsound(); // calls static method "Beep beep!"
        car.printManufacturer(); // prints "Manufacturer: Maruti"
        car.printNumWheels(); // prints "Number of wheels: 4"
    }
}
