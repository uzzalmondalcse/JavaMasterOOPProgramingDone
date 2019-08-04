package MasterOOPBestJava.HashSet_44;

import java.util.HashSet;

public class HashSetMainTest {

    public static void main(String args[]){

        HashSet<String> favMan = new HashSet<String>();

        // firstly add
        favMan.add("Ma");
        favMan.add("Dada");
        favMan.add("Muzahidul islam vaia CEO Techoners");
        favMan.add("Shuvro Paul, Android Developer");
        favMan.add("Shudipto");
        favMan.add("Sunil Kaka");
        favMan.add("Nazmul");

        System.out.println(favMan);
        System.out.println(favMan.size());

        favMan.remove("Nazmul");
        System.out.println(favMan);

        favMan.clear();
        System.out.println(favMan);

        boolean value= favMan.isEmpty();
        System.out.println(value);




     }
}
