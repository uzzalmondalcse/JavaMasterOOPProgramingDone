package MasterOOPBestJava.InheritanceOOP_19;

public class InheritMain {

    public static void main(String args[]){

        /*
        1. All data are private so that now I am using to obj within call set method data .
        2. Inherit for extends keyword.
        3. void display method.
        4. get method declare to display method.
                     All is well , Done.
         */

        Bitm bit1 = new Bitm();
        bit1.setHacker("Farahana A Rahman");
        bit1.setProgrammer("Zohirul Alam Tiemoon");
        bit1.setStudent("Uzzal Mondal");
        bit1.displayBasisInfo();


        Bitm bit2 = new Bitm();
        bit2.setHacker("Sayed Maksadul Kabir");
        bit2.setProgrammer("Bonny Ahmed");
        bit2.setStudent("Sohel vaia");
        bit2.displayBasisInfo();

    }
}
