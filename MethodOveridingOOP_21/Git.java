package MasterOOPBestJava.MethodOveridingOOP_21;

public class Git extends CodeId {

    /*
    1. The same name with extends keyword in child class relation in Parent class,
       that for we are creating  to Method overriding.
    2. Must be declare inheritance that's for extends call of method overriding.
    3. Declaring method subclass which is already present super class this is method overriding.
    4. Sub class, super class, present are same method name that's call method overriding.
    5. static method cannot override.  :)
    6.  Flexible - code reuses, and Runtime polymorphism..  :)
     */

    String allCodingShow;


    @Override
    void displayCodding(){
        System.out.println("Best Pro : "+bestProgram);
        System.out.println("New Pro : "+newProgram);
        System.out.println("Cross Pro : "+crossProgram);
        System.out.println("Hour : "+hour);
        System.out.println("Git All Program show : "+allCodingShow);
        System.out.println("\n");
    }

}
