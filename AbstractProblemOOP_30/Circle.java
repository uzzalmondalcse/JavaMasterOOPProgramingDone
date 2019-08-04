package MasterOOPBestJava.AbstractProblemOOP_30;

public class Circle extends Shape {


    double r;

    Circle(double r){
        this.r = r;
    }



    @Override
    void displayArea() {
        double area = Math.PI* r*r;
        System.out.println("Circle Area : "+area);
    }
}
