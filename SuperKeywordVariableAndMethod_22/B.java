package MasterOOPBestJava.SuperKeywordVariableAndMethod_22;

public class B extends A {

    int x = 5;

    // super keyword is very important to use for that for class working. :)
    // super keyword use for super variable.

    //method override call ..
    @Override
    void display(){

        // super method just  call a method and assign to before super.  like :)
        super.display();

         // at first super method call and lastly call to super variable.

        System.out.println("Parrent "+x);
    }
}
