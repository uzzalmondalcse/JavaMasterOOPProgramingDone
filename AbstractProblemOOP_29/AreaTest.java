package MasterOOPBestJava.AbstractProblemOOP_29;

public class AreaTest {

    public static void main(String args[]){

        Shape r;    // just a create reference, not for object declare.
        r = new Rectangle(10,10);
        r.displayArea();

        Shape c;
        c = new Circle(20);
        c.displayArea();


        Shape t;
        t = new Triangle(20,30);
        t.displayArea();



    }
}
