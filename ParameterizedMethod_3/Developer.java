package MasterOOPBestJava.ParameterizedMethod_3;

public class Developer {     // class name declare :)

    String name;
    String dept;
    int age;


    void devBio(String n, String d, int a){  //declare to parameterized method

         name = n;   // 3 variable are send to parameter method -  n , d, a :)
         dept = d;   // name  assign to n, dept assing d, age asign to a   :)
         age = a;    // data send to storage in variable , if we don't send to data get a null :)

    }


    // Introducing method declare :)
    void developerInfo(){

        System.out.println("Name : "+name);
        System.out.println("Department: "+dept);
        System.out.println("Age : "+age);
        System.out.println("\n");
    }
}
