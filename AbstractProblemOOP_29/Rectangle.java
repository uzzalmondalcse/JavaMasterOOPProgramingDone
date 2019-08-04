package MasterOOPBestJava.AbstractProblemOOP_29;

public class Rectangle extends Shape {


    Rectangle(double d1, double d2){

        super(d1,d2);
    }



    // must be extends with override method declare.
    @Override
    void displayArea() {
        double area = d1*d2;
        System.out.println("Rectangle Area : "+area);

    }

}
