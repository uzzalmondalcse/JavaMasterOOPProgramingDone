package MasterOOPBestJava.ProblemSolving_11;

public class Box {

    double height, width, length;


    Box(double height, double width, double length){
        this.height = height;
        this.width = width;
        this.length = length;

    }

    void displayVol(){
       double vol =  height*width*length;
        System.out.println("Volume is "+vol);
        System.out.println(" ");
    }

}

