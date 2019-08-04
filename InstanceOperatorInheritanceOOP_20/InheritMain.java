package MasterOOPBestJava.InstanceOperatorInheritanceOOP_20;

import MasterOOPBestJava.ClassAndObject_1.Teacher;

public class InheritMain {

    public static void main(String args[]){

        Animal a = new Animal();
        Person p = new Person();
        Teacher t = new Teacher();

        System.out.println(a instanceof Animal);
        System.out.println(p instanceof Person);
        System.out.println(t instanceof Teacher);
        System.out.println(p instanceof Animal);      // cannot asign


    }
}
