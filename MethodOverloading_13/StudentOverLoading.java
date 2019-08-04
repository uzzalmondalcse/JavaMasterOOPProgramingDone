package MasterOOPBestJava.MethodOverloading_13;

public class StudentOverLoading {

    /*
     1. same name declare to method name
     2. parameter are different name.
     3. return type void  declare well, although you can use to data type must be return.
     */


    // this is call for method overloading..   :)
    void stdMethod(String name, String dept, String address, int age) {
        System.out.println("Name : " + name);
        System.out.println("Dept : " + dept);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
        System.out.println("\n");
    }

    String  stdmethod(String address, int age) { // use to String so that , return any value.
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
        System.out.println("\n");
        return address;
       // return address;

    }

    void stdmethod(String name, String address, int age) {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);

        System.out.println("\n");
    }






}
