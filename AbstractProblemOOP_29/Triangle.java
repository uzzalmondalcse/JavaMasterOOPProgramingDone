package MasterOOPBestJava.AbstractProblemOOP_29;

public class Triangle extends Shape {

    // child class.

    Triangle(double d1, double d2){

        super(d1,d2);
    }

   // double area ;

    // must be extends with override method declare.
    @Override
    void displayArea() {
          double area = 0.5*d1*d2;
          System.out.println("Triangle Area : "+area);
    }


}
