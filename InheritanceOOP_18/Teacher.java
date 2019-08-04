package MasterOOPBestJava.InheritanceOOP_18;

public class Teacher extends Person {


    String qualification;


    void displayTeacherInfo(){

        displayPersonInfo();
        System.out.println("Qualification : "+qualification);
    }
}
