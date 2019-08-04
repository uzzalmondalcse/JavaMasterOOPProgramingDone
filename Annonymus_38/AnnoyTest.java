package MasterOOPBestJava.Annonymus_38;

public class AnnoyTest {

    public static void main(String args[]){

        /* 1.  annoymus class.  There is no name declare.
          2.   Runtime er somoy  kono akta class er mehtod ba kono akta  interface  override korte chai.
              se khetre anonymous class help korbe..
          3.  Then object er moadhome display mehtod call korle runtimer somoy udpate hobe.


         */

        Person p = new Person(){     // this is anonymous class

            @Override                 // method override.
            void display(){

                System.out.println("Annoy Test class...");

            }

        };

        p.display();       // object to call method.


    }
}
