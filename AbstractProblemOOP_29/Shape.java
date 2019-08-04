package MasterOOPBestJava.AbstractProblemOOP_29;

public abstract class Shape {

    // we know that , Every class are want to two dimensional, or parameter.

    double d1, d2;

    Shape(double d1, double d2){
        this.d1 = d1;
        this.d2 = d2;
    }




    // create a Abstract class.

    // abstract class including and abstract method declare without body just a signature.

        abstract void displayArea();


}
