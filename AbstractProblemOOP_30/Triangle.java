package MasterOOPBestJava.AbstractProblemOOP_30;

public class Triangle  extends Shape{

    double b, h;

    Triangle(double b, double h){

        this.b = b;
        this.h = h;
    }



    @Override
    void displayArea() {

        double area = 0.5*b*h;
        System.out.println("Triangle Area : "+area);

    }
}
