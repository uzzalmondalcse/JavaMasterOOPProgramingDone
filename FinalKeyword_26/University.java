package MasterOOPBestJava.FinalKeyword_26;

public class University {

    /*
    1. final keyword declare variable don't changeable.
    2. final variable name always Capital hobe..

    # Blank final variable- j final variable sorasori initialize kora hoyni take blank final variable bola hoy..
    # Blank final variable use to must constructor.

    @ final method  can be extends but don't override.
    @ you have to call main method.
     */

    final  String UNIVERSITY_NAME = "KUET"; // final variable don't changeable.
    static final int admit;
    final int fee;

     University() { // create for using blank final variable must initialize constructor :)

        fee = 35000;     // have to declare variable.
    }

    // static final use to static block.
    static {
         admit = 20;
    }


    // final method cannot be override but it's for using to  extends
    // create to another class with extends super class..
    // then override method , don't permission I know.
    final void displayFinal(){


    }



       // Introducing method create call.
    void displayUniversity(){
        System.out.println("University Name : "+UNIVERSITY_NAME);
        System.out.println("University Fee : "+fee);
        System.out.println("University Admit  : "+admit);
    }
}
