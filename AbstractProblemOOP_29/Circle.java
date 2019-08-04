package MasterOOPBestJava.AbstractProblemOOP_29;

public class Circle extends Shape {



    Circle(double r) {
        super(r,r);
    }


    //double area ;


    // must be extends with override method declare.
    @Override
    void displayArea() {
        double area = Math.PI*d1*d2;
        System.out.println("Circle Area : "+area);

    }

}
