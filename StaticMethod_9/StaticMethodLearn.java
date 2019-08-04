package MasterOOPBestJava.StaticMethod_9;

public class StaticMethodLearn {

    /* important..rules.
    1. static method er moddhe static method declare kora jabe.
    2. static method er moddhe non-static method,variable kisui use kora jabena.
    3. non static variable er moddhe static variable with method declare kora jabe..
     */


    // non static method declare..
    void nonStaticMd(){

        System.out.println("Non Static Method declare.");
    }

    //static keyword use to static method declare.
    // static method no need for obj declare in main method, just use to relation in class.

   static void staticMd(){
        System.out.println("Static method declare.");
    }


    // main is static method , so that don't create or no need  a object in main method :)
    public static void main(String[] args ){


        // non static method access to must declare to obj  :)
        StaticMethodLearn obj = new StaticMethodLearn();
        obj.nonStaticMd();


        // static method access to must relation in class name.
        StaticMethodLearn.staticMd();

    }
}
