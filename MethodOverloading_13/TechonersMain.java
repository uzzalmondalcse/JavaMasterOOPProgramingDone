package MasterOOPBestJava.MethodOverloading_13;

public class TechonersMain {

    public  static void main(String args[]){

        Techoners tech1 = new Techoners();
        tech1.techAdd(7000,40000);
        tech1.techAdd(7000,40000,450);
        tech1.techAdd(40000,40000,450,600);
        tech1.techAdd();


    }
}
