package MasterOOPBestJava.PolymorphismOOP_26;

public class PolymorphismMain {

    public static void main(String args[]) {
        /*
        1. Polymorphism is a machanisam, parent class er Reference value Sub class,
           er object gulo ke reference kore..
      Overloading - Compile type - static type. - Method overloading, Constructor Overloading.
      Overriding - Run time - Dynamic type - Method overriding.
                   Parent class er variable gulo sub class a rakhte parbo. :)
                   Must be overriden.
         */

        // method overriding Polymorphism //Runtime Polymorphism // dynamic polymorphism

        // create a all class object...
        Person p = new Person();
        p.displayInfo();

        p = new Teacher();
        p.displayInfo();

        p = new Student();
        p.displayInfo();
    }
}
