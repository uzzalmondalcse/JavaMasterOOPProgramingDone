package MasterOOPBestJava.StaticVariableProject_8;

public class Developer {

    static int count; // static variable.
    int res=0; // instance variable
    static String cName = "Techoners"; // static variable.



    Developer(){
         count++;


    }



    // introducing method call();

    void anInfo(){
        System.out.println("Company Name "+cName);
        System.out.println("Android Developer "+count);
        System.out.println("Web Developer "+count);
        System.out.println("Wordpress Developer "+count);

         res = count+count+count;

        System.out.println("Join our company : "+res);
        System.out.println("");
        System.out.println("\n");




    }



}
