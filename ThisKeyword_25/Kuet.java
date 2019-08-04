package MasterOOPBestJava.ThisKeyword_25;

public class Kuet {



    //*** using to this, keyword to most flexibility , just call parent constructor.
 /*
 1. Refer current class instance variable.
 2. It can be used to call current class constructor.
 3. It can be used to call current class method.
 4. It can be passed argument in the method..      :)
  */

    String dev;
    String pro;
    int person;

    Kuet(){


    }

    Kuet(String dev, String pro){

        this.dev = dev;
        this.pro = pro;

    }

    Kuet(String dev, String pro,int person){

        this(dev,pro); // this keyword use to parent constructor call.
        this.person  = person;
    }

    void displayKeutInfo(){
        System.out.println("Developer : "+dev);
        System.out.println("Programmer : "+pro);
        System.out.println("Person : "+person);
        System.out.println(" \n");
    }

}
