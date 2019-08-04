package MasterOOPBestJava.UpCastingDownCasting_37;

public class Test {

    public static void main(String args[]){


        // this is for up casting .
        Person p = new Teacher();
        p.display();

        //down casting java is not support . cause a small data can't storage a big data.
         Teacher t = (Teacher) new Person(); // down casting.
         t.display();
    }
}
