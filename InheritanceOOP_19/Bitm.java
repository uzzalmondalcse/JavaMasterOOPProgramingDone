package MasterOOPBestJava.InheritanceOOP_19;

public class Bitm extends Basis {

    // private member data and getter and setter create.
    private String student;


    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent() {

        return student;
    }

     // this is method overriding.
    // same name method, with declare extends.
    @Override
    void displayBasisInfo() {
        System.out.println("Hacker : " + getHacker());
        System.out.println("Programmer : " + getProgrammer());
        System.out.println("Student: " + getStudent());
        System.out.println("\n");
    }


//       void displayBitmInfo(){
//        displayBasisInfo();    // this call to another class method.
//        System.out.println("Student: "+getStudent());
//        System.out.println("\n");
//    }
}
