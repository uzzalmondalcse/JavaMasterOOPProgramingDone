package MasterOOPBestJava.SuperKeyWordProjectOOP_24;

public class Vichle {

    /*
       1. super keyword  made by  how to call constructor.
       2. super keyword  made  by how to call  override method.
     */

    // instance variable declare.
    String color;
    int weight;


    // crate a constructor.
    Vichle(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    //create a display method..
    void displayInfo(){
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
    }


}
