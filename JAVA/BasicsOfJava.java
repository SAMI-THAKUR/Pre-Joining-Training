/*
# Variable
Location used to store values
Synta: dataType variableName (declaration
variableName = soemThing (allocation)

# Data Type
Tells how much memory to allocate to the variable
Type of data that can be stored
There are two type of data type in JAVA
1] Primitive Data Type
Stores actual value and not any address
2] Non Primitive Data Type
store address of the object
*/

// Class --> Blueprint that defines variable and methods
class Car {
    static String brand = "AUDI"; // Static Variable (Only one copy there shared with all Instances)
    // Instance Variable (Each object gets its own copy)
    String model;
    int milleage;

    private int sales; // Accessible only inside the class.
    final String modelId = "ABC2026"; // makes a value constant

    // Constructor --> special method called when instance is create
    Car(String model, int milleage){
        this.milleage = milleage; // this keyword used to reference current instance
        this.model = model;
    }

    public void displayInfo(){
        int tripDistance = 150; // Local Variable (Exist only here inside the function)
        double fuelRequired = (double) tripDistance / milleage;
        System.out.println(model);
        System.out.println(milleage);
        System.out.println(tripDistance + " km");
        System.out.println(fuelRequired + " litres");
    }
}
public class BasicsOfJava{

    public static void main(String [] args){
        // # Primitive Data Type
        // ## Integer Types
        byte age = 22; // -128 to 127 (1 byte)
        short bill = 2000; // -32768 to 32767 (2 byte)
        int salary = 50000; // (4 byte)
        long population = 8000000000L; // (8 byte)
        // ## Floating Point Types
        float price = 99.99f; // 4-5 decimal (4 byte) (f is req)
        double pi = 3.1415; // upto 15 decimal (8 byte) most commonly used
        // ## Other Primitive Types
        char grade = 'A'; // single char (2 bytes)
        boolean isPositive = true; // true or false

        // # Non Primitive Data Type
        String name = "Sami Thakur";
        int [] arr = {1,2,3};

        Car A3 = new Car("A3", 24);
        Car A4 = new Car("A4", 20);

        A3.displayInfo();
        A3.milleage = 30; // does not affects all objects
        A3.displayInfo();
        A4.displayInfo();

        Car.brand = "BMW"; // affects all objects

        System.out.println(A3.brand);
        System.out.println(A4.brand);


    }
}