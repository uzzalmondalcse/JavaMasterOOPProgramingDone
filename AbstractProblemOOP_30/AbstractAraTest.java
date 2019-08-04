package MasterOOPBestJava.AbstractProblemOOP_30;

public class AbstractAraTest {

    public static void main(String args[]){

        // Abstract class don't use to object just call a reference.
        Shape s1 ;
        //s1 = new Shape();

        Shape s2;
        s2 = new Rectangle(10,20);
        s2.displayArea();

        Shape s3;
        s3 = new Triangle(20,6);
        s3.displayArea();

        Shape s4;
        s4 = new Circle(10);
        s4.displayArea();
    }
}
