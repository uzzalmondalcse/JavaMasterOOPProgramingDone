package MasterOOPBestJava.ClassAndObject_1;

public class TeacherMain {

    public static void main(String args[]) {

        Teacher teacher1;  // Object declare.
        teacher1 = new Teacher();   // object create.
        teacher1.name = "Sudipto";
        teacher1.dept = "CSE";
        teacher1.age = 25;

        //it's not for using to object call we are use to introducing method.
        System.out.println(teacher1.name);
        System.out.println(teacher1.dept);
        System.out.println(teacher1.age);
        System.out.println("\n");


        Teacher teach2 = new Teacher();  // teach1 is object and Git is reference call.
        teach2.name = "Uzzal";
        teach2.age = 24;
        teach2.dept = "OOP in Java with Android";
        ////use to object and call to method();
        // Introducing method declare.
        teach2.display();



        System.out.println(" ");



        Teacher teach3 = new Teacher();  // agian teach2 declare to object..
        teach3.name = "Muzahidul Islam";
        teach3.dept = "Web Development";
        teach3.age = 36;
        //use to object and call to method();
        // Introducing method declare.
        teach2.display();

    }
}
