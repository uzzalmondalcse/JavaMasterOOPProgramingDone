package MasterOOPBestJava.PolyMorPhismPractical_27;

public class Triangle extends Shape {
    // child class this is extends parent class name of Shape class.

    // create a instance variable..
    double base;
    double height;

    //create a Constructor.
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }



    @Override
    double area(){
        System.out.print("This is Triangle area : ");

        return 0.5* base*height;
    }
}
