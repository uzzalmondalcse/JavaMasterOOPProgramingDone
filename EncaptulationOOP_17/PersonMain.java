package MasterOOPBestJava.EncaptulationOOP_17;

public class PersonMain {

    public static void main(String args[]) {

        // first of all data set , second of all data get .. :)
        Person p1 = new Person();
        p1.setName("Uzzal Mondal");
        p1.setAddress("Khulna , Bangladesh");
        p1.setAge(23);
        p1.displayPersonInfo();


        // System.out.println(p1.toString());


        /*
        System.out.println(p1.getName());
        System.out.println(p1.getAddress());
        System.out.println(p1.getAge());
        System.out.println("\n");
         */


        Person p2 = new Person();
        p2.setName("o2 Mondal");
        p2.setAddress("Khuna , Bangladesh");
        p2.setAge(27);
        p2.displayPersonInfo();

        p2.toString();


        /*
        System.out.println(p2.getName());
        System.out.println(p2.getAddress());
        System.out.println(p2.getAge());
        System.out.println("\n");
         */


        Person p3 = new Person();
        p3.setName("Shaptami Mondal");
        p3.setAddress("Koyra , Bangladesh");
        p3.setAge(37);
        p3.displayPersonInfo();


        p3.toString();


        /*
         System.out.println(p3.getName());
        System.out.println(p3.getAddress());
        System.out.println(p3.getAge());
        System.out.println("\n");
         */


        // p1.displayPersonInfo();

    }
}
