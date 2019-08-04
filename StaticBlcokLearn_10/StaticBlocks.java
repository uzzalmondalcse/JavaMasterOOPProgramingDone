package MasterOOPBestJava.StaticBlcokLearn_10;

public class StaticBlocks {

    // static block main method or age call hoy.

    // this is static variable.
    static int id ;
    static  String name ;

    //static block.
    static {
        id = 10;
        name = "uzzal";
        // static block main method or age call hoy.
        System.out.println(" this is Static block ");
    }

    // static method declare.
    static void staticBl(){
        System.out.println("Name "+name);
        System.out.println("ID "+id);
    }

    public static void main(String args[]){

        StaticBlocks.staticBl();

    }
}
