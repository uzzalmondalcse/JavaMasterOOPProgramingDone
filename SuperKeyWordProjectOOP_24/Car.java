package MasterOOPBestJava.SuperKeyWordProjectOOP_24;

public class Car extends Vichle {


    // instance variable declare.
    int gear;


    // Constructor doing assign create a class constructor with in 2 / 3 parameterized constructor.
    // super constructor call .
    Car(String color, int weight, int gear) {

        super(color, weight); // super constructor call to Vichle class
        this.gear = gear;
    }


    // super override method call..
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Gear : " + gear);
        System.out.println(" ");
    }


}
