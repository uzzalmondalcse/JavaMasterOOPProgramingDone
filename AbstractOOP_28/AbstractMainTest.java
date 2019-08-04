package MasterOOPBestJava.AbstractOOP_28;

public class AbstractMainTest {

    public static void main(String args[]){

        // there is no create object, just a super class er   Reference make kora jabe.
        // Reference, mu dara sub class er object ke refer korte parbo..

        MobileUser mu;    // only create for reference. don't create in object.

        mu = new MuzahidVaia();  // reference = new then super class call
        mu.sendMessage();        // reference in method call .
        mu.displayNon();

        mu = new ShuvroDada();
        mu.sendMessage();


    }
}
