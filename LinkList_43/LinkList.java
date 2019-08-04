package MasterOOPBestJava.LinkList_43;

import java.util.LinkedList;

public class LinkList {

    public static void main(String args[]){

        // Link list a size bole dite parbona , but arrayList a size ta bole dite partamm..

        LinkedList<String> countryNames = new LinkedList<String>(); // create link list
        countryNames.add("Bangladesh"); // country name adding file.
        countryNames.add("Japan");
        countryNames.add("German");
        countryNames.add("Canada");

        countryNames.add(4,"Spain"); // index with element.
        countryNames.addFirst("Australia");  // first of all name showing.
        countryNames.addFirst("WesIndies"); // at last name.
        countryNames.remove("Japan");   // japan.
      //  countryNames.addFirst("Bangladesh");
        // countryNames.remove(1);

        for (String s : countryNames){

            System.out.println(s);
        }
           // size()

       // countryNames.clear();
        System.out.println("List size :  "+countryNames);

        System.out.println("List size :  "+countryNames.size());


        System.out.println("List size :  "+countryNames.getFirst());
        System.out.println("List size :  "+countryNames.getLast());
    }
}
