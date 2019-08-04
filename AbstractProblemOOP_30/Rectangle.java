package MasterOOPBestJava.AbstractProblemOOP_30;

public class Rectangle extends Shape {

     double w, h;

     Rectangle(double w, double h){
        this.w  = w;
        this.h = h;
     }


    // override method must be extends , abstract class.
    @Override
    void displayArea() {

         double area = w*h;
         System.out.println("Rectangel Area : "+area);
    }
}
