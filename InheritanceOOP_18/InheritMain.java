package MasterOOPBestJava.InheritanceOOP_18;

public class InheritMain {

    public static void main(String args[]){

        Teacher t1 = new Teacher(); // reference variable call with create obj
        t1.name = "Uzzal";          // obj to initialize class properties.
        t1.address = "khulna";
        t1.age = 23;
        t1.qualification = "BSC";

       // t1.displayPersonInfo();       // just a simple method call..
        t1.displayTeacherInfo();

        System.out.println("\n");

        Teacher t2 = new Teacher(); // reference variable call with create obj
        t2.name = "Suzal";          // obj to initialize class properties.
        t2.address = "khulna";
        t2.age = 27;
        t2.qualification = "BSS";

       // t2.displayPersonInfo();       // just a simple method call..
        t2.displayTeacherInfo();



    }
}
