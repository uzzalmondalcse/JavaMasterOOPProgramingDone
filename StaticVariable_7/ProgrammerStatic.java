package MasterOOPBestJava.StaticVariable_7;

public class ProgrammerStatic {

     static String soft = "BASIS";

    // create a instance variable. need for memory
    String name;
    String dept;
    int age;
    // create a static variable. for use no need for memory. within relation just class.
    static String companyName = "Techoners";

    // crate a parameter constructor method used to Main method , automatically call

    ProgrammerStatic(){

    }


    ProgrammerStatic(String name, String dept, int age){
        this.name = name;
        this.dept = dept;
        this.age = age;

    }

    //Introducing method.
    void programmerInfo(){
        System.out.println("Name : "+name);
        System.out.println("Department : "+dept);
        System.out.println("Age : "+age);
        System.out.println("Company Nmae : "+companyName);
        System.out.println("");

    }



    public static  void main(String[] args){

        // there is no create obj reason of static keyword, static variable..
        // static keyword relation to class not for object. so, that object we can't declare.
        // ProgrammerStatic obj = new ProgrammerStatic();
        System.out.println("Excute :" +ProgrammerStatic.soft);

        ProgrammerStatic pm = new ProgrammerStatic("Uzzal","Amdroid",24);
        pm.programmerInfo();

        ProgrammerStatic pms = new ProgrammerStatic("Muzahid vaia","Web Development",34);
        pms.programmerInfo();

    }

}
