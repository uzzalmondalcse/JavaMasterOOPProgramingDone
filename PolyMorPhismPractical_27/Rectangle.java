package MasterOOPBestJava.PolyMorPhismPractical_27;

public class Rectangle extends Shape {
    // child class

    // create a instance variable.
    double width;
    double height;

    //create a constructor.
    Rectangle(double width, double height){
        this.width =width;
        this.height = height;
    }


    @Override
    double area(){
        System.out.print("This is Rectangle area : ");
        return width*height;
    }
}
