package MasterOOPBestJava.ToString_43;

public class PersonMain {

    String name;
    int age;

    PersonMain(String name, int age){

        this.name = name;
        this.age = age;
    }

    // sokol class er top class holo object class.
    // sei class er akta method nissi toString();  - method.


    // built in method by toString();
    @Override
    public String toString(){

        return "Name : "+name+"\nAge : "+age;

    }





    public static void main(String args[]){

        PersonMain p1 = new PersonMain("Uzzal",23);
        PersonMain p2 = new PersonMain("Suzal",27);

        System.out.println("Name : "+p1);  // automatically call to to string method.
        System.out.println("Age : "+p2);



    }
}
