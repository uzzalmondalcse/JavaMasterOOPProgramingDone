package MasterOOPBestJava.Constructer_4;

public class Bitm {

    String name ;
    String dept ;
    int age ;

    // declare to constructor :)
    // There are two type of constructor - default constructor, parametrized constructor.
    // first of all class name declare to constructor name.
    // constructor is a special type of method used to initialize the object.
    // method is must call, but constructor no need call , just parameterized declare to object :)
    // Constructor is a special type of method , where the place no need for return type ,even - like void, int :)
    // constructor is initialize to object. but method working to constructor properties.

   //Default Constructor method :)
    Bitm (){
        System.out.println("Default constructor method, no need parameter.");
    }


     // delcare to parameterized constructor :)
    Bitm(String name, String dept, int age){
       this.name = name;
       this.dept = dept;
       this.age = age;

    }


//Introducing method declare
void bitmInfoCall(){
    System.out.println("Name : "+name);
    System.out.println("dept : "+dept);
    System.out.println("age : "+age);
    System.out.println("");
}

}
